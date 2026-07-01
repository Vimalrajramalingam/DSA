class Solution {
    public int maxProduct(int[] nums) {
        int curmax=nums[0];
        int curmin=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp=curmax;
            curmax=Math.max(nums[i],Math.max(curmax*nums[i],curmin*nums[i]));
            curmin=Math.min(nums[i],Math.min(temp*nums[i],curmin*nums[i]));
            max=Math.max(max,curmax);
        }
        return max;
    }
}