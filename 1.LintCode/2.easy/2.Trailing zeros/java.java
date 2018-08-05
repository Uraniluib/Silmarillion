public class Solution {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        if(n == 1) {
            return 0;
        }
        int five = 0;   // 2出现的频率永远低于5，所以只要计算5就行了，一个5配一个2，才能有0
        for(long i = 5; n / i > 0; i *= 5) {//2,4,5,6,8,10,12,14,15,20
            five += n / i;
        }
        return five;
    }
}