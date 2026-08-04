class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int a[]:matrix)
        {
            for(int b:a)
            {
                map.put(b,true);
            
            }
        }
        return map.containsKey(target);
    }
}