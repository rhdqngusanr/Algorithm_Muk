import kotlin.math.*

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        
        var long = 0
        var short = 0
        
        for(i in sizes.indices){
            long = max(max(sizes[i][0],sizes[i][1]),long)
            short = max(min(sizes[i][0],sizes[i][1]),short)
        }
        
        return long * short
    }
}