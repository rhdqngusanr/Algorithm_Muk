import java.text.SimpleDateFormat
import java.util.*
import java.text.DateFormat

class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var termsArray = ArrayList<List<String>>()
      
        val df: DateFormat = SimpleDateFormat("yyyy.MM.dd")
        val cal = Calendar.getInstance()
        var t = today
        var todayDate  = df.parse(today)

        for(i in terms.indices){
            termsArray.add(terms[i].split(" "))
        } 
        println("termsArray: ${termsArray}")
        
        for(i in privacies.indices){
            for(j in termsArray.indices){
                val sp = privacies[i].split(" ")
                if(sp[1] == termsArray[j][0]){
                    var privacie = sp[0]
                    var privacieDate  = df.parse(privacie)
                    //println("privacie: ${privacie}")
                    
                    var n = termsArray[j][1].toInt()
                    cal.time = privacieDate
                    cal.add(Calendar.MONTH, n)
                    println("privacie+: ${df.format(cal.time.time)}")
                    
                    if(cal.time.time<=todayDate.time){
                        answer = answer.plus(i+1)
                    }
                    
                }
            }       
        } 
        
         println("today: ${today}")
        
        return answer
    }
}