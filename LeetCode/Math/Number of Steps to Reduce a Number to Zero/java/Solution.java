class Solution {
    public int numberOfSteps(int num) {
        int sum=0;
        int count=0;
        while(num>0)
        {
            if(num%2==0){
                sum=num/2;
                num=sum;
                count++;
            }
            else{
                sum=num-1;
                num=sum;
                count++;
            }
        }
        return count;
    }
}