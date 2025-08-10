package enum_classes

fun main(){

//    val dayOfWeek = listOf(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY)
//    val dayOfWeek = Day.values().toList()
    val dayOfWeek = Day.entries
    println("Day of the weeks: $dayOfWeek")

    receiveDay(dayOfWeek)
}

fun receiveDay(dayOfWeek: List<Day>) {
    val holiday = dayOfWeek.filter { it.isHoliday }
    val count = dayOfWeek.count() { it.isHoliday }
    println("Holiday: ${holiday.joinToString()} \namount: $count")
}