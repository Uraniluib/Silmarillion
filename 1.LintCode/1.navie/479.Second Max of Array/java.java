public class Solution {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // write your code here
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= max){
                secondMax = max;
                max = nums[i];
            }
            else if(nums[i] >= secondMax){
                secondMax = nums[i];
            }
        }
        return secondMax;
    }
}