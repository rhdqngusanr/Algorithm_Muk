class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var c1 = 0
        var c2 = 0
        var go = 0
        for(i in 0..s.length-1){

            if(i==go){
                for(j in go..s.length-1){
                    if(s[go]==s[j]) c1++ else c2++
                
                    
                    if(c1==c2){
                        go=j+1
                        answer++
                        
                        break
                    }
                }
            }
            
            if(c1+c2 >go){
                answer++
                break
            }

        }
        return answer
    }
}