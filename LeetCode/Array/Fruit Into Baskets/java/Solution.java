class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for(int right = 0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                int fruit = fruits[left];
                int count = map.get(fruit);
                if(count == 1){
                    map.remove(fruit);
                }
                else{
                    map.put(fruit,count-1);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}