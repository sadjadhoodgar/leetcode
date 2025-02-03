package linked_list;

/**
 * LeetCode Problem #21: Merge Two Sorted Lists.
 * Link: <a href="https://leetcode.com/problems/merge-two-sorted-lists/">...</a>
 */
public class MergeTwoLists {
    ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null){
            current.next = list1;
        }else{
            current.next = list2;
        }

        return dummy.next;

    }
}

