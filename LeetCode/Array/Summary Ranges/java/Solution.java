class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> a=new ArrayList<>();
        int i=0;
        
        while(i<nums.length)
        {
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
            {
                i++;
            }
            if(start==nums[i])
            {
                a.add(String.valueOf(start));
            }
            else
            {
                a.add(start+"->"+nums[i]);
            }
            i++;
 
        }
        return a;
    }
}