class Solution {
    fun solution(num: Int, total: Int): ArrayList<Int> {
        var answer = ArrayList<Int>()
        
        var mid = total / num
        var first = 0
        if(total % num == 0){
            first = num / 2
        }else{
            first = num / 2 - 1
        }
        
        var start = mid - first
        for ( i in 0..num-1){
            answer.add(start)
            start++
        }
        return answer
    }
}