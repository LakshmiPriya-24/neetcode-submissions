/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
         while (list1 != null && list2 != null) {
            // Compare the values from both lists and attach the smaller node
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;  // Move the pointer in list1 forward
            } else {
                current.next = list2;
                list2 = list2.next;  // Move the pointer in list2 forward
            }
            current = current.next;  // Move the pointer in the merged list forward
        }

        // If there are remaining nodes in either list, attach them directly
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list starting from the next node of the dummy
        return dummy.next;
    }
}