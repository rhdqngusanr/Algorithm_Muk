class Solution {
    fun solution(my_string: String): String = my_string.chunked(1).distinct().joinToString("")
}