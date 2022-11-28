class Solution {
    fun solution(s: String): String {
        var answer: String = ""
        var array = s.chunked(1)
        answer = array.groupBy{it}.filter { it.value.size == 1 }.flatMap { it.value }.sorted().joinToString("")
        return answer
    }
}