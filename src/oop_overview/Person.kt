package oop_overview

open class Person {
    val name: String = "default name"

    open fun introduce(){
        println("This is Person class")
    }
}