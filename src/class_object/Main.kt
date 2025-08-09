package class_object

fun main(){
    val book1 = Book("Interstellar", "Christopher Nolan", 2015)
    println("title: ${book1.title}, author: ${book1.author}, age: ${book1.age}")
    val book2 = Book("", "", -1)
}