/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        ListNode current = new ListNode(-1);
        ListNode previous = current;
        current.next = head;
        while(previous.next != null){
            if(previous.next.val == val){
                ListNode temp = previous.next;
                previous.next = temp.next;
                temp.next = null;
            }
            else
                previous = previous.next;
        }
        return current.next;
    }
}