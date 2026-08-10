class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right = height.length-1;
        int maxarea = 0;
        int currarea=0;
        int str=0;
        while(left<right){
            int width = right - left;
            str = Math.min(height[left],height[right]);
            currarea=width * str;
            maxarea=Math.max(maxarea,currarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right --;
            }
        }
        return maxarea;    
    }
}