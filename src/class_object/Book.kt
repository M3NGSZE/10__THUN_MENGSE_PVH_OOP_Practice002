package class_object

class Book(var title: String, var author: String, var age: Int) {
    init {
        if (title.isEmpty() || author.isEmpty()) throw IllegalArgumentException("title and author can not be blank")
        if (age < 0) throw IllegalArgumentException("age must be greater than or equal to 0")
    }
}