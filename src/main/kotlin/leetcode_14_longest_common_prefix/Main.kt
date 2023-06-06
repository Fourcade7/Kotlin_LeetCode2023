package leetcode_14_longest_common_prefix

import java.lang.StringIndexOutOfBoundsException as StringIndexOutOfBoundsException1


fun main() {



    val array= arrayOf<String>("flow","flower","flight")


    println(prlastnew(array))

    println(longestCommonPrefixshort(array))

}

fun longestCommonPrefixshort(strs: Array<String>): String {
    val w = strs[0]
    w.forEachIndexed { i, c ->
        if (strs.any { it.length == i || it[i] != c }) return w.substring(0, i)
    }
    return w
}


fun longestCommonPrefix(strs: Array<String>): String {
    //val array= arrayOf<String>("flower","flow","flight")
    val array2 = mutableListOf<String>()
    val array3 = mutableListOf<String>()
    val array4 = mutableListOf<String>("")
    val mmap = mutableMapOf<String, Int>()


    for (ii in 0 until strs.size) {

        for (i in 0 until strs.get(ii).length) {
            for (j in 0 until strs.get(ii).length + 1) {
                var str = strs.get(ii).substring(startIndex = i, endIndex = if (i > j) i else j)
                if (str.isNotEmpty()) {
                    //println(str)
                    array2.add(str)
                }
            }
        }
    }


    var count = 0

    for (i in 0 until array2.size) {
        for (j in 0 until array2.size) {
            if (array2.get(i) == array2.get(j)) {

                count++
                if (count > 1) {
                    mmap.put(array2.get(i), count)
                    if (!array3.contains(array2.get(i))) {
                        array3.add(array2.get(i))
                    }

                }
            }


        }
        count = 0
    }

    array3.forEach {
        println(it)
    }

//    mmap.forEach { t, u ->
//        println("$t -> $u")
//    }

    var lastcount = 0
//
    for (i in 0 until array3.size) {
        //println(array3.get(i))
        for (j in 0 until strs.size) {
            if (strs.get(j).contains(array3.get(i))) {
                lastcount++
            }
        }
        if (lastcount > 1) {
            array4.add(array3.get(i))
        }
        lastcount = 0


    }

    var longprefcount = 0

    for (i in 0 until array4.size) {
        if (array4.get(i).length > longprefcount) {
            longprefcount = i
        }
    }

    if (strs.size == 1) {
        return strs.get(0)
    }
    return array4.get(longprefcount)
}

fun findelement() {
    var foundcounter = 0
    var pr = 0
    val prmap = mutableMapOf<Int, Int>()

    val intarray = intArrayOf(5, 7, 8, 8, 10, 8, 10, 10, 10, 5)
    for (i in 0 until intarray.size) {
        for (j in 0 until intarray.size) {
            if (intarray.get(i) == intarray.get(j)) {
                foundcounter++
            }
        }
        if (foundcounter > 1) {
            if (!prmap.containsValue(intarray.get(i))) {
                prmap.put(foundcounter, intarray.get(i))
            }
        }
        foundcounter = 0
    }

    prmap.forEach { t, u ->
        println("$u -> $t")
    }
}

fun distinct() {


    val intarray = intArrayOf(5, 7, 8, 8, 10, 8, 10, 10, 30, 5)
    val mutableintarray = mutableListOf<Int>()

    intarray.forEach {
        if (!mutableintarray.contains(it)) {
            mutableintarray.add(it)
        }
    }

    mutableintarray.forEach {
        println(it)
    }
}

fun countitems() {
    val intarray = intArrayOf(5, 7, 8, 8, 10, 8, 10, 10, 30, 5)
    val mmap = mutableMapOf<Int, Int>()


    var count = 0
    for (i in 0 until intarray.size) {
        for (j in 0 until intarray.size) {
            if (intarray.get(i) == intarray.get(j)) {
                count++
                if (count > 1) {
                    mmap.put(intarray.get(i), count)
                }
            }
        }
        count = 0
    }
    mmap.forEach { t, u ->
        println("$t -> $u")
    }

}

fun prlastnew(strs: Array<String>):String{
    //val strs= arrayOf<String>("dog","racecar","car")
    var count=0
    var len:String=""

    for (i in 0 until strs.get(0).length){

        val str=strs.get(0).substring(0,i+1)
        //println(str)
        for (j in 0 until strs.size){
            if (strs.get(j).length>=str.length){
                if (str==strs.get(j).substring(0,str.length)){
                    //println(str)
                    count++
                }
            }

        }
        if (count==strs.size){
            println("my $str")
            len=str

        }
        count=0



    }

    return  len

}

fun prlast(strs: Array<String>):String{
    //val strs= arrayOf<String>("dog","racecar","car")
    var count=0
    var len=0

    for (i in 0 until strs.get(0).length){

        val str=strs.get(0).substring(0,i+1)
        //println(str)
        for (j in 0 until strs.size){
            if (strs.get(j).contains(str)){
                count++
            }
        }
        if (count==strs.size){
            //println("my $str")
            if (str.length>len){
                len=str.length
            }
        }
        count=0

    }

   return  strs.get(0).substring(0,len)

}