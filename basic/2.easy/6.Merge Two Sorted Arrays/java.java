public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int[] merge = new int[A.length + B.length];
        System.arraycopy(A,0, merge, 0, A.length);
        System.arraycopy(B, 0, merge, A.length, B.length);
        Arrays.sort(merge);
        return merge;
    }
}