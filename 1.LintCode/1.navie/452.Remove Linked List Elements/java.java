public class Solution {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        //return fibonacci(n-1) + fibonacci(n-2);
        int n1 = 0, n2 = 1, n3 = 1;
        // write your code here
        if(n==1){
            return n1;
        }
        if(n==2){
            return n2;
        }
        for(int i = 0; i < n-2; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}