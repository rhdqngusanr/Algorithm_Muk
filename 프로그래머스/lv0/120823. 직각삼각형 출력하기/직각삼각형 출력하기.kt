fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    var s = ""
    for (i in 1..n){
        for(j in 1..i){
            s+="*"
            if(j==i){
                s+="\r\n"
            }
        }
        
    }
    println(s)
}