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

    public ListNode reverseList(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode newHead = reverseList(node.next);
        ListNode front = node.next;
        front.next = node;
        node.next = null;

        return newHead;
    }

    public ListNode kthnode(ListNode temp, int k) {
        while (temp != null && k > 1) {
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp = head, prev = null;
        while (temp != null) {
            ListNode kthnode = kthnode(temp, k);
            if (kthnode == null) {
                if (prev != null)
                    prev.next = temp;
                break;
            }
            ListNode nextNode = kthnode.next;
            kthnode.next = null;
            ListNode newHead = reverseList(temp);
            if (temp == head) {
                head = newHead;
            } else {
                prev.next = newHead;
            }

            prev = temp;
            temp = nextNode;
        }
        return head;
    }
}