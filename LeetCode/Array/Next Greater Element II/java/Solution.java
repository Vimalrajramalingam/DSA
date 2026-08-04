class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int arr[]=new int[nums.length];
        Arrays.fill(arr,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n*2;i++){
            int j=i%n;
            while(!stack.isEmpty() && nums[stack.peek()]<nums[j])
            {
                arr[stack.pop()]=nums[j];
            }
            if(i<n)
            stack.push(j);
        }
        return arr;
    }
}