class Solution {
    fun solution(numbers: IntArray): Int {
        //val sorted = numbers.sorted()
        //return max(sorted[0] * sorted[1], sorted[sorted.lastIndex] * sorted[sorted.lastIndex - 1])
        var max = -200000000
        for(i in numbers.indices){
            for(j in numbers.indices){
            if(i!=j){
                var num =  numbers[i] * numbers[j]
                    if(max <=num){
                    max = num
                    }
                }

            }
        }
        return max
    }
}