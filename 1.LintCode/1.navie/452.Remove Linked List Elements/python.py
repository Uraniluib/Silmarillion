"""
Definition of ListNode
class ListNode(object):
    def __init__(self, val, next=None):
        self.val = val
        self.next = next
"""

class Solution:
    """
    @param head: a ListNode
    @param val: An integer
    @return: a ListNode
    """
    def removeElements(self, head, val):
        # write your code here
        origin = ListNode(-1)
        previous = origin
        origin.next = head
        while(previous.next):
            if previous.next.val == val:
                temp = previous.next
                previous.next = temp.next
                temp.next = None
            else:
                previous = previous.next
        return origin.next