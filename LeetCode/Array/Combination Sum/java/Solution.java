class Solution {
    List<List<Integer>> list=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        com(0,candidates,target);
        return list;
    }
    public void com(int index,int nums[],int target){
        if(target==0)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            com(i,nums,target-nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}