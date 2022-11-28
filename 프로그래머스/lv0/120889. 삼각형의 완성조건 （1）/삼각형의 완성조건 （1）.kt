class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        var a = sides.toList().sorted()
        if(a.sum() - a.last() > a.last()){
            answer = 1
        }else{
            answer = 2
        }
        return answer
    }
}