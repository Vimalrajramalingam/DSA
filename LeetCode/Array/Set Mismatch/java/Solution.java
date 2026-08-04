class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex])
            {
                swap(nums,i,correctIndex);
            }
            else    i++;
        }
        //loop
        for(int j=0; j<nums.length; j++)
        {
            if(nums[j]!=j+1)
            {
                return new int[] {nums[j], j+1};
            }
        }
        return new int[] {-1,-1};
    }
    public void swap(int[] nums, int a,int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}