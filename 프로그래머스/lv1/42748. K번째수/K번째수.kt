class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
        for(i in commands.indices){
            val res = array.toList().subList(commands[i][0]-1,commands[i][1]).sorted()
                .subList(commands[i][2]-1,commands[i][2])
            answer.add(res.joinToString().toInt())
        }
        return answer.toIntArray()
    }
}