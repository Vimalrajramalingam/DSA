class Solution {
    public int maxSubArray(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                while(nums.length==1){
                    return nums[i];
                }
                sum+=nums[j];
                max=Math.max(sum,max);
            }
        }

        return max;
    }
}