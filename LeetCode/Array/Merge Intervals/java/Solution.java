class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals based on start value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Create ArrayList to store merged intervals
        ArrayList<int[]> list = new ArrayList<>();

        // Step 3: Current interval
        int[] cur = intervals[0];

        // Step 4: Traverse remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            // Overlap
            if (intervals[i][0] <= cur[1]) {
                cur[1] = Math.max(cur[1], intervals[i][1]);
            }

            // No overlap
            else {
                list.add(cur);
                cur = intervals[i];
            }
        }

        // Step 5: Add the last interval
        list.add(cur);

        // Step 6: Convert ArrayList to int[][]
        return list.toArray(new int[list.size()][]);
    }
}