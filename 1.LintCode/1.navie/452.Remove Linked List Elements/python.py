class Solution:
    """
    @param n: an integer
    @return: an ineger f(n)
    """
    def fibonacci(self, n):
        # write your code here
        f = [0,1]
        if n == 1:
            return f[0]
        if n == 2:
            return f[1]
        for i in range(2,n):
            f.append(f[i-1]+f[i-2])
        return f[-1]
