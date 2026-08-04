class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        back(nums,curr,used);
        return result;
    }
    public void back(int nums[],List<Integer> curr,boolean[] used)
    {
        if(curr.size()==nums.length){
            if(!result.contains(curr)){
                result.add(new ArrayList<>(curr));
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            curr.add(nums[i]);
            used[i]=true;
            back(nums,curr,used);
            curr.remove(curr.size()-1);
            used[i]=false;
        }
    }
}