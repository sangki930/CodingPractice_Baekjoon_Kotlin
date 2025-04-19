package math.소수

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val input = br.readLine().split(" ")
    val a = input[0].toLong()
    val b = input[1].toLong()
    val n = input[2].toLong()

    var remainder = if (a >= b) a % b else a
    val sb = StringBuilder()

    for (i in 0 until 1000000) {
        sb.append((remainder * 10) / b)
        remainder = (remainder * 10) % b
    }

    println(sb[(n - 1).toInt()])
    br.close()
}