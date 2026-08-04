class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), n, k, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> currentCombination, int n, int k, int start) {
        if (currentCombination.size() == k) {
            result.add(new ArrayList<>(currentCombination)); 
            return;
        }

        for (int i = start; i <= n; i++) {
            currentCombination.add(i);
            backtrack(result, currentCombination, n, k, i + 1); 
            currentCombination.remove(currentCombination.size() - 1); 
        }
    }
}
