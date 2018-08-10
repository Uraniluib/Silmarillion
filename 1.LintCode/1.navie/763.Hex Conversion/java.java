import java.lang.Math;
public class Solution {
    /**
     * @param n: a decimal number
     * @param k: a Integer represent base-k
     * @return: a base-k number
     */
    public String hexConversion(int n, int k) {
        // write your code here
        int size = n % k;
        if(n==0){
            return "0";
        }
        int[] single = new int[(int)(Math.log(n)/Math.log(k)) + 1];
        for(int i = 0; n > 0; i++){
            int temp = n % k;
            single[i] = temp;
            n = n / k;
        }
        char[] reverse = new char[single.length];
        for(int i = 0; i < single.length; i++){
            if (single[single.length - i - 1] > 9){
                reverse[i] = (char)('A' + single[single.length - i - 1] - 10);
            }
            else{
                reverse[i] = (char)('0' + single[single.length - i - 1]);
            }
        }
        String b = new String(reverse);
        return b;
    }
}