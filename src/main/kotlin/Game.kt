
fun main() {
    val options = arrayOf("Rock", "Papper", "Scissors")
    val gameChoice = getGameChoice(options)
    println(gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) {
    optionsParam[(Math.random() * optionsParam.size).toInt()]
}

