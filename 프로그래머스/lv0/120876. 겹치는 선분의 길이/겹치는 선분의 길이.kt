class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var answer: Int = 0
        var red = ArrayList<Int>()
        var green = ArrayList<Int>()
        var blue = ArrayList<Int>()
        var check = ArrayList<Int>()
        for(i in lines[0][0]+1 .. lines[0][1]){
            red.add(i)
        }
        
        for(i in lines[1][0]+1 .. lines[1][1]){
            green.add(i)
        }
        
        for(i in lines[2][0]+1 .. lines[2][1]){
            blue.add(i)
        }        
        val rg = red.intersect(green) 
        val rb = red.intersect(blue) 
        val gb = green.intersect(blue)
        val rgb = (rg + rb + gb).distinct()
        
        return rgb.size
    }
}