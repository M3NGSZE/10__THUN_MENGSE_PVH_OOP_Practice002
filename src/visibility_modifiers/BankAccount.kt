package visibility_modifiers

data class BankAccount (private var balance: Double){
    fun deposit(amount: Double){
        if (amount <= 0) println("Amount of deposit must be greater than $0")
        else{
            balance += amount
            println("Deposit successfully balance: $balance")
        }
    }
    fun withdraw(amount: Double) {
        if (balance <= 0 || balance < amount) println("Your balance is not enough for withdraw")
        else {
            balance -= amount
            println("Withdraw successfully balance: $balance")
        }
    }
}