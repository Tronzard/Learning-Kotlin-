fun main(){
    val str = "May the force be with you"
    println(str)
    val multstr = """
        A long
        time
        ago
    """.trimIndent()
    println(multstr)
//    for (char in str){
//        println(char)
//    }
    val a = str.contentEquals("May the force be with you")
    println(a)

    val contains = str.contains("force", true)
    println(contains)

    val uppercase = str.uppercase()
    val low = str.lowercase()
    println(uppercase + low)

    val subsequence = str.subSequence(4,13)
    println(subsequence)

    val satyam = "Satyam Khatiwada"
    val swordColor = "Red"
    val vehicle = "Arcanine"
    val number = 10

    println("$satyam has a $swordColor sword and drives $number  $vehicle")
    println("$satyam name has ${satyam.length} characters")
}