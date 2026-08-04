class Solution {
    public int calPoints(String[] operations) {
         Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (String op : operations) {
            if (op.equals("C")) {
                sum -= stack.pop();
            } else if (op.equals("D")) {
                int prevScore = stack.peek();
                stack.push(2 * prevScore);
                sum += 2 * prevScore;
            } else if (op.equals("+")) {
                int prev1 = stack.pop();
                int prev2 = stack.peek();
                stack.push(prev1);
                stack.push(prev1 + prev2);
                sum += (prev1 + prev2);
            } else {
                int score = Integer.parseInt(op);
                stack.push(score);
                sum += score;
            }
        }
        return sum;
    
    }
}