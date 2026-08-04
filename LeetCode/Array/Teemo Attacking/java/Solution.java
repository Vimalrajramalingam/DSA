class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }

        int totalPoisonedTime = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            
            if (timeSeries[i] + duration <= timeSeries[i+1]) {
                totalPoisonedTime += duration;
            } else {
                
                totalPoisonedTime += timeSeries[i+1] - timeSeries[i];
            }
        }
        
        totalPoisonedTime += duration;
        return totalPoisonedTime;
    }

    
}