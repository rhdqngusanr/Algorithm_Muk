class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        var t = n-1
        var s = 0
        for(i in num_list.indices){
            if(i % n == 0){
                
                answer = answer.plus(num_list.sliceArray(s..t))
                s= t+1
                t= t+n 
            }
        }
        return answer
    }
}