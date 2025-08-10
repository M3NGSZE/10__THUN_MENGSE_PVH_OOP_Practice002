package visibility_modifiers

class Car: Vehicle(0) {
    private var currentSpeed = 0
    fun increaseSpeed(speed: Int){
        this.speed += speed
//        println("Increasing speed: $speed")
        if (this.speed >= 120) println("Reaching maximum speed 120")
        else currentSpeed += speed

        println("Current speed at: $currentSpeed\n")

    }
}