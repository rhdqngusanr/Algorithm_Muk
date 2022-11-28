class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        var line = ArrayList<Float>()
        for(i in 0..3){
            for(j in i+1..3){
                val result = 
                ((dots[i][1] - dots[j][1]).toFloat() / (dots[i][0] - dots[j][0]).toFloat()).toFloat()
                line.add(result)
            }
        }
        
         for(i in 0..line.size-2){
            for(j in i+1..line.size-1){
               if(line[i]==line[j]) return 1
            }
        }
        return answer
    }
}