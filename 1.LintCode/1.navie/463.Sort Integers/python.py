class Solution:
    """
    @param A: an integer array
    @return: nothing
    """
    def sortIntegers(self, A):
        # write your code here
        for i in range(0,len(A)):
            for j in range(i,len(A)):
                if A[i] > A[j]:
                    temp = A[i]
                    A[i] = A[j]
                    A[j] = temp
