class Solution:
    """
    @param n: a decimal number
    @param k: a Integer represent base-k
    @return: a base-k number
    """
    def hexConversion(self, n, k):
        # write your code here
        if n == 0:
            return "0"
        silm = []
        while n > 0:
            temp = n % k
            if temp > 9:
                silm.append(chr(temp + ord('A') - 10))
            else:
                silm.append(chr(temp + ord('0')))
            n = n / k
        silm.reverse()
        return ''.join(silm)