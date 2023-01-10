class Solution {
    fun solution(slice: Int, n: Int): Int {
        var p = slice
        while(p<n){
            println("while")
            p+=slice
        }
        return p/slice
    }
}