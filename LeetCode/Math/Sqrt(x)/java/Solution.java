class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        long low = 1; 
        long high = x;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                ans = mid; 
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return (int) ans;
    }
}
    