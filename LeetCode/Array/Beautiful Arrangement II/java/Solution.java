class Solution {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];

        int left = 1;
        int right = n;
        int index = 0;

        while (k > 0) {
            if (k % 2 == 1) {
                res[index++] = left++;
            } else {
                res[index++] = right--;
            }
            k--;
        }

        if (index > 0 && res[index - 1] == left - 1) {
            while (left <= right) {
                res[index++] = left++;
            }
        } else {
            while (left <= right) {
                res[index++] = right--;
            }
        }

        return res;
    }
}