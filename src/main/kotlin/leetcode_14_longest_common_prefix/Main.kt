package leetcode_14_longest_common_prefix


fun main() {


    val array= arrayOf<String>("flower","flowe","floightwe")






}

fun findelement(){
    var foundcounter=0
    var pr=0
    val prmap= mutableMapOf<Int,Int>()

    val intarray= intArrayOf(5,7,8,8,10,8,10,10,10,5)
    for (i in 0 until intarray.size){
        for (j in 0 until intarray.size){
            if (intarray.get(i)==intarray.get(j)){
                foundcounter++
            }
        }
        if (foundcounter>1){
            if (!prmap.containsValue(intarray.get(i))){
                prmap.put(foundcounter,intarray.get(i))
            }
        }
        foundcounter=0
    }

    prmap.forEach { t, u ->
        println("$u $t")
    }
}