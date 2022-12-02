class Solution {
    fun solution(polynomial: String): String {
        if(polynomial == "0") return "0"

        var x = 0
        var num = 0
        val list = polynomial.split(" + ")

        list.forEach{
            if(it.contains("x")){
                val n = it.replaceFirst(".$".toRegex(), "")
                x += if(n.isEmpty()){
                    1
                } else {
                    n.toInt()
                }
            } else {
                num += it.toInt()
            }
        }

        val answer = if(x == 0) "" else if(x == 1) "x" else "${x}x"

        return if(answer.isEmpty()) "$num" else if(num != 0) "$answer + $num" else answer
    }
}