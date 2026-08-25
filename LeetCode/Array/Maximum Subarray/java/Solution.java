class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int totalmax = nums[0];
        for(int right = 1 ; right < nums.length ; right++){
            max = Math.max(nums[right],max+nums[right]);
            totalmax = Math.max(totalmax,max);
        }
        return totalmax ;
    }
}