package leetcode_1_two_sum

fun main() {


    val array= intArrayOf(3,2,4)
    val target=6

    for (i in 0 until array.size){

        for (j in i+1 until array.size){
           if (array.get(i)+array.get(j)==target){
               println("$i $j")
           }
        }
    }



}

fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size){

        for (j in i+1 until nums.size){
            if (nums.get(i)+nums.get(j)==target){
                println("found nums ${nums.get(i)} nums ${nums.get(j)}")
                return intArrayOf(i,j)
            }
        }
    }
    //throw IllegalArgumentException("No solution discovered")
    return IntArray(0)

}