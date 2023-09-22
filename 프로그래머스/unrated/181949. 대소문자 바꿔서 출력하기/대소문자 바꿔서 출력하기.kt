fun main(args: Array<String>) {
    val s1 = readLine()!!
    
    val s2 = s1.toMutableList()
    
    for(i in s2.indices){
        if(s2[i].isUpperCase()) {
           
            s2[i] = s2[i].toLowerCase()
        }
        else if(s2[i].isLowerCase()) {
            
            s2[i] = s2[i].toUpperCase()
        }
    }
    
    
    print(s2.joinToString(""))
}