public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        StringBuilder str = new StringBuilder();
        str.append(number);
        str = str.reverse();
        String result = String.valueOf(str);
        if(result.substring(0,1).equals("0")){
            result = result.substring(1,result.length());
        }
        return Integer.parseInt(result);
    }
}