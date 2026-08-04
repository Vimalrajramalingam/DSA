class Solution {
    public int findJudge(int n, int[][] trust) {
         if (n == 1 && trust.length == 0) {
            return 1;
        }

        int[] inDegrees = new int[n + 1];
        int[] outDegrees = new int[n + 1];

        for (int[] relation : trust) {
            int trustingPerson = relation[0];
            int trustedPerson = relation[1];
            outDegrees[trustingPerson]++;
            inDegrees[trustedPerson]++;
        }

        for (int i = 1; i <= n; i++) {
            if (outDegrees[i] == 0 && inDegrees[i] == n - 1) {
                return i;
            }
        }

        return -1;
    
    }
}