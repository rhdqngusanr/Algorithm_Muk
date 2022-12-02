class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0,0)
     
        for(i in keyinput.indices){
            if(keyinput[i].equals("left")){
                answer[0] = answer[0] - 1 
            }else if(keyinput[i].equals("right")){
                answer[0] = answer[0] + 1 
            }else if(keyinput[i].equals("down")){
                answer[1] = answer[1]- 1 
            }else{
                 answer[1] = answer[1] + 1 
            }
                    var lix = board[0] / 2 
            var liy = board[1] / 2
        
            if(answer[0] < 0 && answer[0] < -lix){
                answer[0] = -lix
            }else if(answer[0] > 0 && answer[0] > lix){
                answer[0] = lix
            }
        
            if(answer[1] < 0 && answer[1] < -liy){
                answer[1] = -liy
            }else if(answer[1] > 0 && answer[1] > liy){
                answer[1] = liy
            }
        }

        return answer
    }
}