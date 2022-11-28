import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        val x = sqrt(n.toDouble()).toInt()
        if(x * x == n){
            answer = 1
        }else{
            answer = 2
        }
        
        return answer
    }
}