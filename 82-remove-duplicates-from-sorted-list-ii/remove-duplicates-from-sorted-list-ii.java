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
    public ListNode deleteDuplicates(ListNode head) {
        // Create a dummy node to handle head deletion easily
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy; // Last known distinct node
        
        while (head != null) {
            // If we find the start of a duplicate sublist
            if (head.next != null && head.val == head.next.val) {
                // Move head forward until we pass all duplicates of this value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Skip all the duplicates by linking prev to the node AFTER the duplicates
                prev.next = head.next;
            } else {
                // No duplicate detected, move prev pointer forward
                prev = prev.next;
            }
            // Move head forward for the next iteration
            head = head.next;
        }
        
        return dummy.next;
    }
}
