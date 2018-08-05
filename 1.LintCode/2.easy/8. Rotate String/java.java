public class Solution {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if(offset != 0 && str.length != 0) {
            offset %= str.length;
            if(offset != 0) {
                char[] copy = str.clone();
                for (int i = 0; i < offset; i++) {
                    str[i] = copy[str.length - offset + i];
                }
                for (int i = offset; i < str.length; i++) {
                    str[i] = copy[i - offset];
                }
            }
        }
    }
}