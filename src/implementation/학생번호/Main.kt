package implementation.학생번호

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 학생번호 1235
 */
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val N = br.readLine().toInt()
    val list = ArrayList<String>()
    var len = 0
    for(i in 0 until N){
        var s = br.readLine().reversed()
        list.add(s)
        len = s.length
    }

    for(i in 1 .. len){
        val set : HashSet<String> = list.map { it.substring(0,i) }.toHashSet()

        if(list.size == set.size){
            println(i);
            break;
        }
    }

}