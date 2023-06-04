package leetcode_9_palindrome_number


fun main() {


    println(isPalindrome(9987654321))





}


fun isPalindrome(x: Long): Boolean {

    if (x>Math.pow(-2.0,-31.0) && x<Math.pow(2.0,31.0)-1){

        if (x.toString()== reverseword(x.toString())){
            return true
        }else{
            return false
        }


    }
    return false
}


fun reverseword(name:String):String{
    var rev=""
    for(i in name.length-1 downTo 0){
        rev="$rev${name.get(i)}"
    }
    return rev
}

fun isPalindromeshort(x: Int): Boolean {

    return   x.toString().reversed() ==  x.toString()
}