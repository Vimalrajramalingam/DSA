class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        int[] a = new int[128];
        for (char c : t.toCharArray()) a[c]++;

        int l = 0, r = 0, minlen = Integer.MAX_VALUE, st = 0;
        int cnt = t.length();

        while (r < s.length()) {
            if (a[s.charAt(r)] > 0) cnt--;
            a[s.charAt(r)]--;
            r++;

            while (cnt == 0) {
                if (r - l < minlen) {
                    minlen = r - l;
                    st = l;
                }
                a[s.charAt(l)]++;
                if (a[s.charAt(l)] > 0) cnt++;
                l++;
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(st, st + minlen);
    }
}