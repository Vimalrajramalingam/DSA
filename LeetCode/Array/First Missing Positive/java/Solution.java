class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int res[] = new int[set.size()];
        int j = 0;
        for(int i : set){
            res[j] = i;
            j++;
        }
        Arrays.sort(res);
        int index = 1;
        for(int i = 0;i<res.length;i++){
            if(res[i] > 0){
                if(res[i] != index)
                {
                    return index ; 
                }
                index++;
            }
        }
        return index;
    }
}