class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int r=0;r<nums.length;r++)
        {
            sum+=nums[r];
            if(r-left+1==k){
                max=Math.max(sum,max);
                sum-=nums[left];
                left++;
            }
        }
        return (double)max/k;        
    }
}