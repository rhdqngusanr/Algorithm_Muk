class Solution {
    fun solution(age: Int): String {
        var r = ""
        var answer = age.toString().chunked(1)
        for(i in answer.indices){
            r += (answer[i].toInt() + 97 ).toChar().toString()
        }
        
        return r
    }
}