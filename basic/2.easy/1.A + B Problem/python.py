#因为python整形无限大，所以导致不能直接用java魔改，不然会很慢很慢很慢

class Solution:
"""
@param a: An integer
@param b: An integer
@return: The sum of a and b 
"""
def aplusb(self, a, b):
    # write your code here
    while b != 0:
        xor = a ^ b
        b = (a & b) << 1
        a = xor & 0xFFFFFFFF
    return a if a >> 31 == 0 else a - 4294967296