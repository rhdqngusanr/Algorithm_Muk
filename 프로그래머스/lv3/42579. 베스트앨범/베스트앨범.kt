class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
     
        var answer = genres.indices.groupBy { genres[it] }
            .toList()
            .sortedByDescending { it.second.sumBy { plays[it] } }
            .map { it.second.sortedByDescending { plays[it] }.take(2) }
            .flatten()
            .toIntArray()
       
        return answer
    }
}