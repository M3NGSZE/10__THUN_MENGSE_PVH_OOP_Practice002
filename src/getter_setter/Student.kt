package getter_setter

class Student {
    var grade: Int = 0
        set(value) = if (value < 0 || value > 100) field = 0 else field = value
    var isPassed: Boolean = false
        private set(value) = if (grade >= 0) field = value else field = value
}