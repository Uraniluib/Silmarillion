class Solution:
    """
    @param str: An array of char
    @param offset: An integer
    @return: nothing
    """
    def rotateString(self, str, offset):
        # write your code here
        if len(str) != 0:
            offset %= len(str)
            if offset != 0:
                a = str[:-offset]
                b = str[-offset:]
                c = b + a
                #str.replace(b+a)
                for i, item in enumerate(str):
                    str[i] = c[i]