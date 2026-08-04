class Solution {
    public int findNumbers(int[] nums) {
        int arr[]=new int[nums.length];
        int count=0;
        int max=0;
        for(int num:nums){
            while(num>0){
                count ++;
                num=num/10;
            }
            if(count%2==0){
                max++;
            }
            count=0;
        }
        return max;
    }
}