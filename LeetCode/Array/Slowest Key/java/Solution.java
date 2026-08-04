class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
         int n = releaseTimes.length;
        int maxDuration = releaseTimes[0];
        char slowestKey = keysPressed.charAt(0);
        
        for (int i = 1; i < n; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            if (duration > maxDuration) {
                maxDuration = duration;
                slowestKey = keysPressed.charAt(i);
            } 
            else if (duration == maxDuration) {
                if (keysPressed.charAt(i) > slowestKey) {
                    slowestKey = keysPressed.charAt(i);
                }
            }
        }
        
        return slowestKey;
    }
}