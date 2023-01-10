class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer = ArrayList<String>()
        var t = my_string.chunked(1)
        for(i in t.indices){
            for(j in 0 until n){
                answer.add(t[i])
            }
        }
        return answer.joinToString("")
    }
}