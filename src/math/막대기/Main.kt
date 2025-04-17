package math.막대기

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var input = sc.nextInt()
    var i = 6 + 1
    var answer = 0
    while (i-- > 0) {
        // println("i의값 : $i")
        if (input / (1 shl i) == 0) {
            continue
        } else {
            input = input - (1 shl i)
            answer++
        }
    }

    println(answer)
}
