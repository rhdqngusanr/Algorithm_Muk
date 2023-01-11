class Solution {
    fun solution(s: String): IntArray {
        var answer = MutableList(s.length) {-1}

        println(answer)
        for ((i, c) in s.withIndex()) {
            if (i == 0) {
                continue
            }
            var count = 0
            for (j in i - 1 downTo 0) {
                count++
                if (s[j] == c) {
                    answer[i] = count
                    println(answer[i])
                    break
                }
            }
        }
        return answer.toIntArray()
    }
}