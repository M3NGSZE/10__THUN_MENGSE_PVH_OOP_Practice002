package data_class

fun main(){
    val product = Product(1, 5.94)
    println("Original: $product")

    val newProduct = product.copy(price = 6.99)

    println("Copy: $newProduct")

}