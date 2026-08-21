class Solution {
    int count = 0;
    String store = "";
    public String getPermutation(int n, int k) {
        boolean[] used = new boolean[n];
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        StringBuilder sb = new StringBuilder();
        back(used,n,k,arr,sb);
        return store;
    }
    public void back(boolean[] used,int n,int k,int arr[],StringBuilder sb){
        if(sb.length()==n){
            count++;
            if(count == k){
                store = sb.toString();
            }
            return ;

        }
        for(int i=0;i<n;i++){
            if(used[i]){
                continue;
            }
            sb.append(arr[i]);
            used[i]=true;
            back(used,n,k,arr,sb);
            sb.deleteCharAt(sb.length()-1);
            used[i]=false;
        }
    }
}