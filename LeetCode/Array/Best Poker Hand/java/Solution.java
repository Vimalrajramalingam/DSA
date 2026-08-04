class Solution {
    public String bestHand(int[] ranks, char[] suits) {
         boolean isFlush = true;
        for (int i = 1; i < suits.length; i++) {
            if (suits[i] != suits[0]) {
                isFlush = false;
                break;
            }
        }
        if (isFlush) {
            return "Flush";
        }
        Map<Integer, Integer> rankCounts = new HashMap<>();
        for (int rank : ranks) {
            rankCounts.put(rank, rankCounts.getOrDefault(rank, 0) + 1);
        }

        int maxCount = 0;
        for (int count : rankCounts.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        if (maxCount >= 3) {
            return "Three of a Kind";
        }
        if (maxCount == 2) {
            return "Pair";
        }
        return "High Card";
    
    }
}