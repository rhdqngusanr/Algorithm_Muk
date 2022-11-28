class Solution {
    fun solution(my_string: String): String {
        var a = my_string.toMutableList()
        
        for(i in a.indices){
            if(a[i].isUpperCase()){
               a[i] =  a[i].toLowerCase()
            }else{
                a[i] =  a[i].toUpperCase()
            }
        }
        return a.joinToString("")
    }
}