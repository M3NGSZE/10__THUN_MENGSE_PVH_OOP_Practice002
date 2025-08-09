package getter_setter

fun main(){
    val student = Student()
    student.grade = 75
    println("grade: ${student.grade}, isPassed: ${student.isPassed}")
    student.grade = 101
    println("grade: ${student.grade}, isPassed: ${student.isPassed}")
    student.grade = 45
    println("grade: ${student.grade}, isPassed: ${student.isPassed}")
}