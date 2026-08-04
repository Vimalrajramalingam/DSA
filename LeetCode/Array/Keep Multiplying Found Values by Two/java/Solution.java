class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        while (numsSet.contains(original)) {
            original *= 2;
        }

        return original;

    }
}