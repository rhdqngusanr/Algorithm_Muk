class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        var number = my_string.replace("[^0-9]".toRegex(), " ")
        var sp = number.split(" ")
        for(i in sp.indices){
            if(sp[i]!= ""){
                answer += sp[i].toInt()
            }
        }
    
        return answer
    }
}