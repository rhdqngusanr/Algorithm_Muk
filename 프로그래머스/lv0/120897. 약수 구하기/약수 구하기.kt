class Solution {
    fun solution(n: Int): ArrayList<Int> {
        var answer = ArrayList<Int>()
        for (i in 1.. n){
            if(n % i == 0){
                answer.add(i)
            }
        }
        return answer
    }
}