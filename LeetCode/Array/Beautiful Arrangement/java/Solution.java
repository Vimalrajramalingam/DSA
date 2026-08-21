class Solution {
    int count = 0;
    public int countArrangement(int n) {
        boolean[] used = new boolean[n];
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        back(used,arr,n,1);
        return count ;
    }
    public void back(boolean[] used,int arr[],int n,int position){
        if(position > n){
            count ++;
            return ;
        }
        for(int i=0;i<n;i++){
            if(used[i]){
                continue ;
            }
            if(position % arr[i] == 0 || arr[i] % position == 0){
                used[i] = true;
                back(used,arr,n,position+1);
                used[i] = false ;
            }
        }
    }
}