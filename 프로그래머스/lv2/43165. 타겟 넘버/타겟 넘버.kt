class Solution {
    var answer = 0
    fun solution(numbers: IntArray, target: Int): Int {
        dfs(numbers,0,target,0)
        return answer
    }
    
    fun dfs(numbers: IntArray,now:Int , target:Int,sum:Int){
        if(now == numbers.size){
            if(target== sum) answer ++
        }else{
            dfs(numbers,now+1,target, sum+numbers[now])
            dfs(numbers,now+1,target, sum-numbers[now])
        }
    }
}