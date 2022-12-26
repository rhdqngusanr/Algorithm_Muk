class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var arr = numbers.sortedDescending()
        answer = arr[0] * arr[1]
        return answer
    }
}