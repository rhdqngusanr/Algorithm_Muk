class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        answer += hp/5
        var t = hp%5
        answer += t/3
        answer += t%3
        return answer
    }
}