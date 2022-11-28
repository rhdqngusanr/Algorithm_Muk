class Solution {
    fun solution(order: Int): Int {
        var answer: Int = 0
        var a = order.toString().chunked(1).toMutableList()
        for(i in a.indices){
            if(a[i] != "0"&&a[i].toInt() % 3 == 0){
                answer++
            }
        }
        return answer
    }
}