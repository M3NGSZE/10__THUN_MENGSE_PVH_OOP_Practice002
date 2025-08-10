package inheritance

class Dog(name: String): Animal(name) {
    override fun speak() {
        super.speak()
        if (soundCount % 2 != 0) println("$name says woof!")
        else println("$name is silent this time")
    }
}