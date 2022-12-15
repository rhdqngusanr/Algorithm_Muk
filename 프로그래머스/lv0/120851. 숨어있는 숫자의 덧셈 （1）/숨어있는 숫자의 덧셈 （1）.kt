class Solution {
    fun solution(my_string: String): Int {
        var answer: Int 
        val array = my_string.replace("[^\\d]".toRegex(), "").chunked(1)
        answer = array.toList().map{it -> it.toInt()}.sum()
        
        return answer
    }
}