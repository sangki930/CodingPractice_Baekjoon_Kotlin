package implementation.`1181`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.IOException

/*
* 단어정렬
* */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val N = br.readLine().toInt()

    val arr = Array(N) { "" }

    for (i in 0 until N) {
        arr[i] = br.readLine()
    }

    arr.sortWith(Comparator { s1, s2 ->
        // 단어 길이가 같을 경우
        if (s1.length == s2.length) {
            s1.compareTo(s2)
        }
        // 그 외의 경우
        else {
            s1.length - s2.length
        }
    })

    val sb = StringBuilder()

    sb.append(arr[0]).append('\n')
    for (i in 1 until N) {
        // 중복되지 않는 단어만 출력
        if (arr[i] != arr[i - 1]) {
            sb.append(arr[i]).append('\n')
        }
    }

    println(sb)
}
