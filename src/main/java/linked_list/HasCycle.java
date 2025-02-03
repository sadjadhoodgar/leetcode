package linked_list;

/**
 * LeetCode Problem #141: Linked List Cycle.
 * Link: <a href="https://leetcode.com/problems/linked-list-cycle/">...</a>
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast){
            if(fast == null || fast.next == null)
                return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
