class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ;
        int prefix[] = new int[n+1];
        int suffix[] = new int[n+1];
        int result[] = new int[n];
        prefix[0] = 1;
        for(int i=0;i<nums.length;i++){
            prefix[i+1] = prefix[i]*nums[i];
        }
        suffix[nums.length] = 1;
        for(int i = nums.length-1;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            result[i] = prefix[i]*suffix[i+1];
        }
        return result ;
    }
}