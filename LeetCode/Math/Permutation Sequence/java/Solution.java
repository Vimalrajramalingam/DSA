class Solution {
    int count=0;
    String ans = "";
    boolean found=false;

    public String getPermutation(int n, int k) {

        boolean[] used=new boolean[n+1];

        StringBuilder sb = new StringBuilder();

        back(n,k,used,sb);

        return ans;
    }

    public void back(int n,int k,boolean[] used,StringBuilder sb){

        if(found){
            return ;
        }

        if(sb.length()==n){
            count++;
            if(k==count){
                ans=sb.toString();
                found=true;
            }return;
        }
        for(int i=1;i<=n;i++){
            if(used[i]){
                continue;
            }
            sb.append(i);
            used[i]=true;
            back(n,k,used,sb);
            sb.deleteCharAt(sb.length()-1);
            used[i]=false;
        }
    
    }

}