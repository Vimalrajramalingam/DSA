class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int c:nums1)
        {
            a.add(c);
        }
        for(int d:nums2)
        {
            if(a.contains(d))
            {
                b.add(d);
            }
        }
        int output[]=new int[b.size()];
        int i=0;
        for(int get:b)
        {
            output[i++]=get;
        }
        return output;
    }
}