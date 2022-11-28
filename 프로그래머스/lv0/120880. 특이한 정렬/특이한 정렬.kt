import kotlin.math.*
import java.util.*
class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        
         var a = numlist.sortedWith(compareBy<Int> { Math.abs(it - n) }
        .thenByDescending { it })
        return a.toIntArray()
    }
}