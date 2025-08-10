package visibility_modifiers

fun main(){
    val bankAccount = BankAccount(100.00)
    bankAccount.deposit(21.33)
    bankAccount.withdraw(55.77)

    println("\n========================================\n")

    val car = Car()
    car.increaseSpeed(23)
    car.increaseSpeed(33)
    car.increaseSpeed(43)
    car.increaseSpeed(53)
    car.increaseSpeed(63)
}