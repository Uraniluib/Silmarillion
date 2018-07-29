class Solution:
    """
    @param number: A 3-digit number.
    @return: Reversed number.
    """
    def reverseInteger(self, number):
        # write your code here
        temp = str(number)
        temp = temp[::-1]
        if temp[:1] == "0":
            temp = temp[2:]
        return int(temp)