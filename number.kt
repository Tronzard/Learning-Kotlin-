fun main() {
    fun forceChoke() {
         println("hello")
    }
    forceChoke()

    fun makeAnEntrance(line: String) {
        println(line)
    }
    makeAnEntrance("I find your lack of faith disturbing")

    fun calculate(rebels: Int, ewoks: Int): Int{
        val good = rebels + ewoks
        return good
    }

    println(calculate(2,3))

    val x = 1
    when (x) {
        1 -> println("pillu")
        2 -> println("pilluer")
        else -> println("pilluest")
    }

}