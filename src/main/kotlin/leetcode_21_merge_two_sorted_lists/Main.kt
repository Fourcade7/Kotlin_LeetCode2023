package leetcode_21_merge_two_sorted_lists





fun main(){

    var list1=ListNode(1)
    list1.next= ListNode(2)
    list1.next?.next= ListNode(4)

    val list2=ListNode(1)
    list2.next=ListNode(3)
    list2.next?.next=ListNode(4)

//    println(list1.`val`)
//    println(list1.next?.`val`)
//    println(list1.next?.next?.`val`)
//    println(list1.next?.next?.next?.`val`)



}


class ListNode(var `val`: Int) {
         var next: ListNode? = null
   }
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {


        val result = ListNode(0)
        var l1 = list1
        var l2 = list2
        var current = result

        while (l1 != null && l2 != null) {
            if (l1.`val` < l2.`val`) {
                current.next = l1
                l1 = l1.next
            } else {
                current.next = l2
                l2 = l2.next
            }
            current = current.next!!
        }

        if (l1 != null) current.next = l1
        if (l2 != null) current.next = l2

        return result.next



    }
}