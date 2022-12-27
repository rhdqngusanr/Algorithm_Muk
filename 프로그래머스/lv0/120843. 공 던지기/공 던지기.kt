class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var answer = numbers
        var num = answer.size
        println("$num")
        while(num <= k*2){
            answer = answer.plus(numbers)
            num= answer.size
            println("$num")

        }
        return answer[k*2-2]
    }
}