class Solution {
   fun solution(s1: Array<String>, s2: Array<String>) = s1.map(s2::contains).count { it }
}