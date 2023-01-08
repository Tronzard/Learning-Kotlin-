fun main() {
    val names = arrayListOf("cat", "dog", "duck")
    val Wnames = hashMapOf("t" to "tiger", "l" to "lion","b" to "bear")

    //created a variable name which cycles each items of names
    for (name in names) {
        println("Name: $name")
    }

    for ((key,value) in Wnames)
        println(key + " for " + value)

    var x = 3
    
    while (x>0){
        println(x)
        x--
    }

}