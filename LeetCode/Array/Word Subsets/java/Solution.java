class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {

        List<String> result = new ArrayList<>();

        // Find maximum required frequency
        int[] required = new int[26];

        for (String word : words2) {

            int[] count = new int[26];

            for (char ch : word.toCharArray()) {
                count[ch - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                required[i] = Math.max(required[i], count[i]);
            }
        }

        // Check words1
        for (String s : words1) {

            int[] count = new int[26];

            for (char ch : s.toCharArray()) {
                count[ch - 'a']++;
            }

            boolean valid = true;

            for (int i = 0; i < 26; i++) {
                if (count[i] < required[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(s);
            }
        }

        return result;
    }
}