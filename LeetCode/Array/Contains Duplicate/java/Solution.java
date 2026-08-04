class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dup=new HashSet<>();
        for(int n:nums)
        {
            if(dup.contains(n))
            {
                return true;
                
            }
            else
            {
                dup.add(n);
            }
        }
        return false;
    }
}