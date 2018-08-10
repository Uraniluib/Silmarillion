"""
Definition of ListNode
class ListNode(object):
    def __init__(self, val, next=None):
        self.val = val
        self.next = next
"""

class Solution:
    """
    @param head: the first node of linked list.
    @return: An integer
    """
    def countNodes(self, head):
        # write your code here
        count = 0
        origin = ListNode(-1)
        origin.next = head
        while origin.next:
            count += 1
            origin = origin.next
        return count
