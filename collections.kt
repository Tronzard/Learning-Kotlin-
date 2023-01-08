fun main(args: Array<String>) {
    // immutable arrays
    val impperials = listOf("Emperor", "Darth", "Boethiah")
    println(impperials)
    println(impperials.sorted())
    println(impperials[1])
    println(impperials.contains("Emperor"))

    //mutable arrays
    val rebels = arrayListOf("Satyam", "Pillu", "kookie")
    println(rebels.size)
    rebels.add("Dillu")
    println(rebels)
    rebels.add(2, "Aapey")
    println(rebels)
    println(rebels.indexOf("kookie"))
    rebels.remove("Satyam")

    //immutable map(map is indexed array with key to find items)
    val rebelVehicles = mapOf("Solo" to "Falcon", "Satyam" to "Arcanine") //Solo is key, so is satyam
    println(rebelVehicles["Solo"])
    println(rebelVehicles.get("Solo"))
    println(rebelVehicles.getOrDefault("Solo", defaultValue = "Xaina hai ya"))
    println(rebelVehicles.keys)
    println(rebelVehicles.values)

    //mutable map
    val rebVeh = hashMapOf("Solo" to "Falcon", "Satyam" to "Arcanine")
    rebVeh["Satyam"] = "God"
    rebVeh.put("pilluni", "cycle")
    println(rebVeh)
    rebVeh.remove("Solo")
    println(rebVeh)

}