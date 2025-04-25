package math.터렛

import java.util.Scanner
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)
    val T = sc.nextInt()
    repeat(T) {
        val x = IntArray(3)
        val y = IntArray(3)
        val r = IntArray(3)
        for (i in 1..2) {
            x[i] = sc.nextInt()
            y[i] = sc.nextInt()
            r[i] = sc.nextInt()
        }
        val dotDistance = sqrt((x[1] - x[2]).toDouble().pow(2.0) + (y[1] - y[2]).toDouble().pow(2.0))
        val circleSum = r[1] + r[2]
        val circleSub = abs(r[1] - r[2])
        when {
            dotDistance == 0.0 && circleSub == 0 -> println(-1)
            dotDistance < circleSub || dotDistance > circleSum -> println(0)
            dotDistance == circleSub.toDouble() || dotDistance == circleSum.toDouble() -> println(1)
            else -> println(2)
        }
    }
    sc.close()
}
