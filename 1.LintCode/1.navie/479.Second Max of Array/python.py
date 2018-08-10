class Solution:
    """
    @param nums: An integer array
    @return: The second max number in the array.
    """
    def secondMax(self, nums):
        # write your code here
        max1 = min(nums)
        secondMax = min(nums)
        for i in nums:
            if max1 <= i:
                secondMax = max1
                max1 = i
            elif secondMax <= i:
                secondMax = i
        return secondMax
