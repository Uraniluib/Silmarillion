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
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        // write your code here
        ListNode origin = new ListNode(-1);
        origin.next = head;
        int count = 0;
        while(origin.next != null){
            count++;
            origin = origin.next;
        }
        return count;
    }
}