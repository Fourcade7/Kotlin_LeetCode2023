package leetcode_20_valid_parentheses


fun main() {


    var s="()(){[]}"


    println(isValid(s))







}

fun isValid(ss: String): Boolean {
    var len=-1
    var s=ss
    while (len!=s.length){//7
        len=s.length//5
        s=s.replace("()","").replace("[]","").replace("{}","")//1
        if (s.length==0){
            return true
        }
    }
    return false
}