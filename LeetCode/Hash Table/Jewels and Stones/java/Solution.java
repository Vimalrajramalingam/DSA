class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++)
        {
            for(int a=0;a<jewels.length();a++)
            {
                char s=stones.charAt(i);
                char j=jewels.charAt(a);
                if(s==j)
                {
                    count++;
                }
            }
        }
        return count;
    }
}