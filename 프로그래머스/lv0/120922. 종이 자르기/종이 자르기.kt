class Solution {
    fun solution(M: Int, N: Int): Int {
        var answer: Int = 0
        if(M * N > 1){
            answer = M * N - 1
        }else{
            answer = 0
        }
        return answer
    }
}