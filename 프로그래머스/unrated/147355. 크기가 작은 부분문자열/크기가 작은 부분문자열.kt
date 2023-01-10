class Solution {
    fun solution(t: String, p: String): Int {
        var array = ArrayList<Long>()
        var s = 0     
        var e = p.length-1
        while(e<t.length){
            array.add((t.slice(s..e)).toLong())
            s +=1
            e +=1
        }
        return array.filter{it <= p.toLong()}.size
    }
}