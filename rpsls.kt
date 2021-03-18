abstract class Character(userThrow: String) {

    init {
        if (userThrow != "Rock" && userThrow != "Paper" && userThrow != "Scissors" && userThrow != "Lizard" && userThrow != "Spock") {
            println("Invalid user input.")
        }
    }

    abstract fun displayDesc(desc: String)
}

class Rock(userThrow: String): Character(userThrow) {

    override fun displayDesc(desc: String) {
        println(desc)
    }
}

class Paper(userThrow: String): Character(userThrow) {

    override fun displayDesc(desc: String) {
        println(desc)
    }
}

class Scissors(userThrow: String): Character(userThrow) {

    override fun displayDesc(desc: String) {
        println(desc)
    }
}

class Lizard(userThrow: String): Character(userThrow) {

    override fun displayDesc(desc: String) {
        println(desc)
    }
}

class Spock(userThrow: String): Character(userThrow) {

    override fun displayDesc(desc: String) {
        println(desc)
    }
}

fun generateCompThrow(): String {
    val numCompThrow = (1..5).random()

    val compList1 = listOf("Rock", "Paper", "Scissors", "Lizard", "Spock")

    var compThrow = compList1[numCompThrow - 1]
    println("The computer threw: $compThrow")

    return compThrow
}

// Gets the input from the user.
fun getUserThrow(): String {
    val compList = listOf("Rock", "Paper", "Scissors", "Lizard", "Spock")
    print("Enter your throw: ")
    println("Options:")
    for(n in compList){
        println("$n")
    }
    print("> ")
    val userInput = readLine()
    val userThrow: String = userInput as String
    return userThrow
}

fun determineWinner(userThrow: String, compThrow: String): String {
    var result: String = "It's a tie!"
    var winner: String
    if (compThrow == userThrow) {
        println(result)
        winner = "None"
        return winner
    }
    else if (userThrow == "Paper" && compThrow == "Rock" || userThrow == "Paper" && compThrow == "Spock") {
        result = "You Win!"
        println(result)
        winner = userThrow
        return winner
    }
    else if (userThrow == "Rock" && compThrow == "Scissors" || userThrow == "Rock" && compThrow == "Lizard") {
        result = "You Win!"
        println(result)
        winner = userThrow
        return winner
    }
    else if (userThrow == "Scissors" && compThrow == "Lizard" || userThrow == "Scissors" && compThrow == "Paper") {
        result = "You Win!"
        println(result)
        winner = userThrow
        return winner
    }
    else if (userThrow == "Lizard" && compThrow == "Spock" || userThrow == "Lizard" && compThrow == "Paper") {
        //same as previous body
        result = "You Win!"
        println(result)
        winner = userThrow
        return winner
    }
    //Spock defeats scissors and rock
    else if (userThrow == "Spock" ) {
        //same as previous body
        result = "You Win!"
        println(result)
        winner = userThrow
        return winner
    }
    else {
        result = "You Lose!"
        println(result)
        winner = compThrow
        return winner
    }
}

fun main(args: Array<String>) {

    val userThrow = getUserThrow()
    val compThrow = generateCompThrow()
    val winner = determineWinner(userThrow, compThrow)
    val rock = Rock(userThrow)
    val paper = Paper(userThrow)
    val scissors = Scissors(userThrow)
    val lizard = Lizard(userThrow)
    val spock = Spock(userThrow)
    
    println("$userThrow vs. $compThrow")

    if (winner == "Rock") {
        rock.displayDesc("Rock defeats Lizard and Scissors.")
    }
    else if (winner == "Paper") {
        paper.displayDesc("Paper defeats Rock and Spock.")
    }
    else if (winner == "Scissors") {
        scissors.displayDesc("Scissors defeats Lizard and Paper.")
    }
    else if (winner == "Lizard") {
        lizard.displayDesc("Lizard defeats Spock and Paper.")
    }
    else if (winner == "Spock") {
        spock.displayDesc("Spock defeats Scissors and Rock.")
    }
    else {
        println()
    }
    
}
