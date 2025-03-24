package implementation.`1010`

import java.util.*

/*
* 1010번 다리놓기
* */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val T = scanner.nextInt()

    for (i in 0 until T) {
        val N = scanner.nextInt()
        val M = scanner.nextInt()

        val dp = Array(N + 1) { IntArray(M + 1) }

        for (n in 2..N) {
            dp[n][1] = 0
        }

        for (m in 1..M) {
            dp[1][m] = m
        }

        for (x in 2..N) {
            for (y in 2..M) {
                dp[x][y] = dp[x][y - 1] + dp[x - 1][y - 1]
            }
        }

        println(dp[N][M])
    }
}