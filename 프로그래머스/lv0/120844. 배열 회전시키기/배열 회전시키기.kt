class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        //var answer: IntArray = intArrayOf()
        
        
        if(direction =="right"){
            var temp = numbers.last()
            for(i in numbers.size-1  downTo 1){
                numbers[i] = numbers[i-1]
                println("${numbers[i]}")
            }
            numbers[0] = temp
        }else{
            var temp = numbers.first()
            for(i in 0 .. numbers.size-2 ){
                numbers[i] = numbers[i+1]
                println("${numbers[i]}")
            }
            numbers[numbers.size-1] = temp
        }
        return numbers
    }
}