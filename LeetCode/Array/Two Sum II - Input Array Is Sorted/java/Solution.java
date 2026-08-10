class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int sum = 0;
        while(left<numbers.length && right>0){
            sum = numbers[left]+numbers[right];
            if(numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }
            if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[] {};
        
    }
}