class Solution {
    public int missingNumber(int[] nums) {
        int index = 0;
        int store = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i < nums.length ; i++){
            set.add(nums[i]);
        }
        for(int i : set){
            if(!set.contains(index)){
               return index ;
            }
            index++;
        }
        return index;
        
    }
}