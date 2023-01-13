import java.util.*

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var sc = Stack<Int>()
        for(i in score.indices){
            if(i <k){
                sc.push(score[i])
            }else{
                sc.push(score[i])
                sc.sortDescending()
                sc.pop()
            }
            sc.sort()
            answer = answer.plus(sc[0])
        }
        return answer
    }
}