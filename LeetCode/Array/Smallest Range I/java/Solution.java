class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minVal = Arrays.stream(nums).min().getAsInt();
        int maxVal = Arrays.stream(nums).max().getAsInt();
        int potentialScore = maxVal - k - (minVal + k);
        return Math.max(0, potentialScore);
    }
}
    