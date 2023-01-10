class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var t = array.groupBy{it}.entries.sortedByDescending{it.value.size}
        
        if(t.size > 1 && t[0].value.size == t[1].value.size){
            answer = -1
        }else{
            answer = t[0].key
        }
        return answer
    }
}