class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int res = 0;
        while(i<j){
            int width=j-i;
            int curh=Math.min(height[i],height[j]);
            int cura=width*curh;
            res=Math.max(cura,res);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return res;
    }
}