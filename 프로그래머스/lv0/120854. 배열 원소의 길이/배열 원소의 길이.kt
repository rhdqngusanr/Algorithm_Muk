class Solution {
    fun solution(strlist: Array<String>): IntArray {
        //var answer: IntArray = intArrayOf()
        //strlist.map{it -> strlist.chunked(1).size}.toIntArray()
        return strlist.toList().map{it -> it.chunked(1).size}.toIntArray()
    }
}