class Solution {
    fun solution(my_string: String): Int {

        return my_string.split("[A-z]+".toRegex()).filter(String::isNotEmpty).map{ it.toInt() }.sum()
    }
}