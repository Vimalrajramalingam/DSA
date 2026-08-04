class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> cur = new ArrayList<>();
        back(candidates,0,0,target,cur);
        return res;
    }
    public void back(int nums[],int start,int sum,int target,List<Integer> cur){
        if(sum==target){
        res.add(new ArrayList<>(cur));
        return ;
        }
        if(sum>target){
            return;
        }
        for(int i=start;i<nums.length;i++){
            cur.add(nums[i]);
            back(nums,i,sum+nums[i],target,cur);
            cur.remove(cur.size()-1);
        }

    }
}