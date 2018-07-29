public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b 
     */
    public int aplusb(int a, int b) {
        // write your code here
        if(b==0){
            return a;
        }
        int xor = a ^ b;
        int carry = (a & b) << 1;
        return aplusb(xor, carry);
    }
}