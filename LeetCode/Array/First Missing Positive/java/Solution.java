class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int arr[] = new int[set.size()];
        int j=0;
        for(int i : set){
            arr[j] = i;
            j++;
        }
        Arrays.sort(arr);
        int expected = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                if(arr[i] == expected){
                    expected++;
                    continue ;
                }
                if(arr[i] < expected){
                    continue ;
                }
                if(arr[i]>expected){
                    return expected;
                }
            }

        }
        return expected;
    }
}