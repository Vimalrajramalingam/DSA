class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> cur = new ArrayList<>();
        back(nums,0,cur);
        return res;
    }
    public void back(int nums[],int index,List<Integer> cur){
        res.add(new ArrayList<>(cur));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            cur.add(nums[i]);
            back(nums,i+1,cur);
            cur.remove(cur.size()-1);
        }

    }
}