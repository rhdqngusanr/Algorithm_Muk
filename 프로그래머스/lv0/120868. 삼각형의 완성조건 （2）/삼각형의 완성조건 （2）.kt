class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        
        
        var max = sides.maxOrNull()
        var min = sides.minOrNull()
        var b1 = max!! - (max!! - min!!)
        var b2 = (max!! + min!!) - max!! - 1 
        
        return b1+b2
    }
}