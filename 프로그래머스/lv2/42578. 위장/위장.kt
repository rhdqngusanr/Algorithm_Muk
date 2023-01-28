class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        var t = clothes.groupBy{       
            it[1]
        }
        t.forEach{ key, value  ->
            answer *= value.size+1
        }
        return answer -1 
    }
}