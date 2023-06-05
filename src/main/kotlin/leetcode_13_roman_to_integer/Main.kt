package leetcode_13_roman_to_integer





fun main(){
    println(romanToInt("IVI"))
}


fun romanToInt(s: String): Int? {

    val map= mapOf(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )
    var c:Int=0
    var prev=0

    s.forEach {
        var cur=map.get(it.toString())
        //println(map.get(it.toString()))
        c =c+ cur!!
        if (cur > prev) {
            c=c-prev*2
        }
        prev = cur


    }



    return c
}

