class Solution {
    fun solution(numbers: IntArray, k: Int) = numbers[ (k * 2 - 2) % numbers.size]
}