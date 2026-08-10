class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
            }
            else{
                set.remove(num);
            }
        }
        for(int a:set){
            return a;
        }
        return 0;
    }
}