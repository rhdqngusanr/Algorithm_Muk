class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        var array = rsp.chunked(1)
        for(i in array.indices){
            if(array[i] == "2"){
                answer+="0"
            }else if(array[i] == "0"){
                 answer+="5"
            }else{
                answer+="2"
            }
        }
        return answer
    }
}