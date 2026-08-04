class Solution {
    public String reversePrefix(String s, int k) {
       char a[]=s.toCharArray();
        int start=0;
        int end=k-1;
        while(start<end){
            char temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        return new String(a);
    }
}