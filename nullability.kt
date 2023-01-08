fun main() {
    var name: String = "Satyam"
    var nullablename: String? = null

    //nullcheck
    var length = 0
    if (nullablename != null) {
        length = nullablename.length
    } else {
        length = -1
    }
    println(length)

    val l = if (nullablename != null) nullablename.length else -1
    println(l)

    //safe call operator using ?
    println(nullablename?.length)


    //elvis operator method to avoid null
    val len = nullablename?.length ?: -1
    val noname = nullablename?.length ?: "Noone knows me"

    // jabarjasti null pointer exception crash - use !! on null variable
    println(nullablename!!.length)


}