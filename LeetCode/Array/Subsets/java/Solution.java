class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        res.add(new ArrayList<>());

        for (int num : nums) {

            int n = res.size();

            for (int i = 0; i < n; i++) {

                List<Integer> ans = new ArrayList<>(res.get(i));

                ans.add(num);

                res.add(ans);
            }
        }

        return res;
    }
}