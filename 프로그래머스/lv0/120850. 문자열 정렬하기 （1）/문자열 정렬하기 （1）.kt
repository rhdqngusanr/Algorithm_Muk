class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()
        answer = my_string.filter(Char::isDigit).chunked(1).sorted().toList().map{it -> it.toInt()}.toIntArray()
        return answer
    }
}