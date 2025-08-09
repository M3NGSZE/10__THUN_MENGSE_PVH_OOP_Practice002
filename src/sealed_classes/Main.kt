package sealed_classes

fun main(){
//    val result = Result.Success()
    handleSealed(Result.Error())
}

fun handleSealed(result: Result){
    when(result){
        is Result.Success -> println(result.value)
        is Result.Error -> println(result.message)
    }
}


//    val result = Result.Success()
//
//    when(result){
//         is Result.Success -> println(Result.Success().value)
//         is Result.Error -> println(Result.Error().message)
//        else -> {}
//    }
//
//    val x = 2
//
//    when (x) {
//        1 -> println("One")
//        2 -> println("Two")
//        else -> println("Other")
//    }
