package inheritance

fun main(){

    val animals: List<Animal> = listOf(
        Animal("Generic Animal"),
        Dog("Buddy"),
        Animal("Elephant"),
        Dog("Rocky")
    )

    for (animal in animals) {
        animal.speak()
        animal.speak()
        println("Name: ${animal.name}")
        println("Type: ${animal::class.simpleName}")
        println("Sound Count: ${animal.soundCount}")
        if (animal is Dog) {
            println("This animal is a dog")
        }
        println()  // Blank line for readability
    }

}

//    val animal = Animal("Ava")
//    val dog = Dog("Zuz")
//
//    animal.speak()
//    dog.speak()
//    println()
//
//
//    animal.speak()
//    dog.speak()