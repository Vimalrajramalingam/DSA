class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        int store  =   0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) > max){
                store = i;
                max = map.get(i);
            }
         
        }
        return store ;
    }
}