fun main(args: Array<String>) {
    var animal = Animals(
        "Lion", "Girrafe", "Goose", "Snakes", "Turtles", "Lizards", "Baboon",
        "Zebra", "Kangoroo", "Ostrich"
    )
    animal1("shading")
    animal2("eating")
    animal3("sleeping")
    animal4("sleeping")
    animal5("eating")
    animal6("sleeping")
    animal7("eating")
    animal8("grazing")
    animal9("hopping")
    animal10("running")






}


data class Animals(
    var animal1: String, var animal2: String, var animal3: String, var animal4: String, var animal5: String,
    var animals6: String, var animals7: String, var animal8: String, var animal9: String, var animals10: String
)


    fun animal1(Lion: String) {

        when (Lion) {
            "sleeping" -> println("The lion might be sick call the wildlife veterinarian")
            "eating" -> println("The lion is healthy")
            "produce sound"->println("calling others")
            else -> println("report the case")

        }
    }

        fun  animal2(Girrafe:String) {
            when (Girrafe) {
                "sleeping" -> println("The girrafe might be sick call the wildlife veterinarian")
                "eating" -> println("The girrafe is healthy")
                "produce sound"->println("calling others")
                else -> println("report the case")
        }
    }

fun  animal3(Goose:String) {
    when (Goose) {
        "sleeping" -> println("The goose might be sick call the avian veterinarian")
        "eating" -> println("The goose is healthy")
        "produce sound"->println("calling others")
        else -> println("report the case")
    }
}
fun  animal4(snakes:String) {
    when (snakes) {
        "sleeping" -> println("The snakes might be sick call the veterinarian")
        "eating" -> println("The snakes is healthy")
        "produce hissing sound"->println("calling others")
        else -> println("report the case")
    }
}

fun  animal5(Turtles:String) {
    when (Turtles) {
        "sleeping" -> println("The turtles might be sick call the veterinarian")
        "eating" -> println("The turtles is healthy")
        "produce hissing sound"->println("calling others")
        else -> println("report the case")
    }
}

fun  animal6(Lizards:String) {
    when (Lizards) {
        "sleeping" -> println("The lizards might be sick call the veterinarian")
        "eating" -> println("The lizards is healthy")
        "produce hissing sound"->println("calling others")
        else -> println("report the case")
    }
}

fun  animal7(Baboon:String) {
    when (Baboon) {
        "sleeping" -> println("The baboon might be sick call the veterinarian")
        "grazing" -> println("The baboon is healthy")
        "produce hissing sound"->println("calling others")
        else -> println("report the case")
    }
}

fun  animal8(Zebra:String) {
    when (Zebra) {
        "sleeping" -> println("The Zebra might be sick call the veterinarian")
        "eating" -> println("The Zebra is healthy")
        "produce hissing sound"->println("calling others")
        else -> println("report the case")
    }
}

fun  animal9(Kangaroo:String) {
    when (Kangaroo) {
        "sleeping" -> println("The Kangaroo might be sick call the veterinarian")
        "eating" -> println("The Kangaroo is healthy")
        "produce hissing sound"->println("calling others")
        else -> println("report the case")
    }
}
fun  animal10(Ostrich:String) {
    when (Ostrich) {
        "sleeping" -> println("The Ostrich might be sick call the veterinarian")
        "eating" -> println("The Ostrich is healthy")
        "running" -> println("The Ostrich is okey")
        "produce hissing sound"->println("calling others")
        else -> println("report the case")
    }
}





