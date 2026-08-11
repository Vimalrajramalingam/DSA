class Solution {
    public int maxVowels(String s, int k) {

        int left = 0;
        int count = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            // Character entering the window
            if (isVowel(s.charAt(right))) {
                count++;
            }

            // Window has reached size k
            if (right - left + 1 == k) {

                max = Math.max(max, count);

                // Character leaving the window
                if (isVowel(s.charAt(left))) {
                    count--;
                }

                left++;
            }
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
}