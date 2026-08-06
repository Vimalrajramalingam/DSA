class Solution {
    public int smallestNumber(int n, int t) {
        int n1=n;
        int product=1;
        while(n1!=0){
            int digit=n1%10;
            product=product*digit;
            n1=n1/10;
        }
        if(product % t == 0){
            return n;
        }
        else{
            return smallestNumber(n+1,t);
        }
    }
}