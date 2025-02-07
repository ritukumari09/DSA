public class SortList {
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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;  
        }
        ListNode mid = getMiddle(head);
        ListNode rightHalf = mid.next;
        mid.next = null;
        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(rightHalf);

        return mergeTwoLists(leftSorted, rightSorted);
    }
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head.next; 
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
     private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }
}
}
/*
 * Given the head of a linked list, return the list after sorting it in ascending order.

 

Example 1:
Input: head = [4,2,1,3]
Output: [1,2,3,4]

Example 2:
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]


Example 3:
Input: head = []
Output: []
 */