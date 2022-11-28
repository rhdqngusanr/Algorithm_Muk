class Solution {
    fun solution(A: String, B: String): Int {
        var answer: Int = 0
        var str = A
        if(A.equals(B)){
            return 0
        }
        for(i in 0.. A.length-1){
            var str2 = str.substring(str.length-1)
            str = str2 + str.substring(0, str.length-1)
            answer++
            if(str.equals(B)){
                return answer
            }
            
        }
        return -1
    }
}