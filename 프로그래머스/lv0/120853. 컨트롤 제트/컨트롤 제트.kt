import kotlin.math.abs
class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var array = s.split(" ")
        for(i in array.indices){
            if(array[i]== "Z"){
                answer -= array[i-1].toInt()  
            }else{
                answer+= array[i].toInt()
            }
            
        }
        return answer
    }
}