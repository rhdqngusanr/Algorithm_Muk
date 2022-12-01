class Solution {
    fun solution(board: Array<IntArray>): String {
        var answer: Int = 0
        var boomMap = board.toMutableList()
        var boom : MutableList<Int> = mutableListOf()
        for(i in board[0].indices){
            boom.add(-1)
        }
        boom.add(-1)
        boom.add(-1)
        
        boomMap.add(0,boom.toIntArray())
        boomMap.add(boomMap.size,boom.toIntArray())
        
        
        for(i in 1.. boomMap.size -2){
            boom = mutableListOf()
            boom.add(-1)
            for(j in boomMap[i].indices){
                 boom.add(boomMap[i][j])
            }
            boom.add(-1)
            boomMap[i] = boom.toIntArray()
        }
        return boomMap.toTypedArray().contentDeepToString()
    }
}