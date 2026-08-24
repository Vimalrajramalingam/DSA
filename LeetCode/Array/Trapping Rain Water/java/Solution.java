class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftmax = 0;
        int rightmax = 0;
        int totalwater = 0;
        int water = 0;
        while(left < right){
            leftmax = Math.max(leftmax,height[left]);
            rightmax = Math.max(rightmax , height[right]);
            int waterlevel = Math.min(leftmax,rightmax);
            if(height[left]<height[right]){
                water = waterlevel - height[left];
                left++;
            }
            else{
                water = waterlevel - height[right];
                right --;
            }
            totalwater = totalwater+water;
        }
        return totalwater ;
    }
}