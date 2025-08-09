package sealed_classes

sealed class Result {
    class Success: Result(){
        var value: Int = 200
    }

    class Error: Result(){
        var message: String = "status 404"
    }

}

