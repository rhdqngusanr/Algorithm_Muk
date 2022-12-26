class Solution {
    fun solution(n: Int): Int {
        var currnt = 1
        var answer = 1
        while (currnt < n) {
            
            answer++
            currnt *= answer
            println("${answer} / ${currnt}")
        }
        if (currnt > n)
            return answer - 1
        return answer
    }
}