class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int prod=1;
        int ans = 0;
        if(k<=1){
            return 0;
        }
        for(int r=0;r<nums.length;r++){
            prod*=nums[r];
            while(prod>=k){
                prod/=nums[l];
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
}