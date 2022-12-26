import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for(i in 2..n){
            for(j in 2.. sqrt(i.toDouble()).toInt()){
                if(i%j==0){
                    answer++
                    break
                }
            }
        }
        return answer
    }
}