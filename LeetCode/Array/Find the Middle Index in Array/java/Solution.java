class Solution {
    public int findMiddleIndex(int[] nums) {

        int n = nums.length;

        // Build Prefix Sum Array
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Total Sum
        int total = prefix[n - 1];

        // Find Middle Index
        for (int i = 0; i < n; i++) {

            int left = prefix[i] - nums[i];
            int right = total - prefix[i];

            if (left == right) {
                return i;
            }
        }

        return -1;
    }
}