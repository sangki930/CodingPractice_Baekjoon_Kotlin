package implementation.`1340`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalDate
import java.time.temporal.ChronoUnit

// 연도 진행바
fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))
    var input = br.readLine()
    // May 10, 1981 00:31
    var arr : List<String> = input.split(" ")
    var day = arr[1].replace(",","").toInt()
    val monthMap = mapOf(
        "January" to 1,
        "February" to 2,
        "March" to 3,
        "April" to 4,
        "May" to 5,
        "June" to 6,
        "July" to 7,
        "August" to 8,
        "September" to 9,
        "October" to 10,
        "November" to 11,
        "December" to 12
    )
    var year = arr[2].toInt()
    var time = arr[3].split(":")
    var hour = time[0].toInt()
    var min = time[1].toInt()
    var month = monthMap[arr[0]]!!
    val totalmin = getTotalMin(year)
    var accmin = min + 60 * hour + daysSinceStartOfYear(year, month, day) * 1440

    println(accmin * 100.0 / totalmin)

    br.close()

}

fun daysSinceStartOfYear(year: Int, month: Int, day: Int): Long {
    // 1월 1일 날짜
    val startOfYear = LocalDate.of(year, 1, 1)

    // 현재 날짜
    val currentDate = LocalDate.of(year, month, day)

    // 날짜 차이 계산
    return ChronoUnit.DAYS.between(startOfYear, currentDate)
}

fun getTotalMin(year: Int): Int {
    // 윤년 여부 체크
    val isLeapYear = isLeapYear(year)

    // 윤년일 경우 366일, 평년일 경우 365일
    val totalDays = if (isLeapYear) 366 else 365

    // 총 분 계산
    return totalDays * 24 * 60
}

// 윤년 체크 함수
fun isLeapYear(year: Int): Boolean {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}

