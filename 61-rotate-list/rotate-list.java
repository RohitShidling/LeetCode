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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode tail = head;
        int len = 0;
        while (tail != null) {
            tail = tail.next;
            len++;
        }

        k = k % len;
        if (k == 0)
            return head;

        int stop = len - k;
        ListNode temp = head;
        for (int i = 1; i < stop; i++) {
            temp = temp.next;
        }

        ListNode newHead = temp.next;
        temp.next = null;

        tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;

        return newHead;
    }
}