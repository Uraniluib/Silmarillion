"""
Definition of TreeNode:
class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left, self.right = None, None
"""

class Solution:
    """
    @param: root: the root of tree
    @return: the max node
    """
    def maxNode(self, root):
        # write your code here
        if root == None:
            return None
        max = root.val;
        maxNode = root
        nodeList = []
        while (root != None) or (len(nodeList) != 0):
            while root != None:
                nodeList.append(root)
                if root.val > max:
                    max = root.val
                    maxNode = root
                root = root.left
            if len(nodeList) != 0:
                root = nodeList.pop(0)
                root = root.right
        return maxNode
