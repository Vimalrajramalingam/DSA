class Solution {
    public int mostWordsFound(String[] sentences) {
        int  max=0 , count = 0;
        for(int i= 0 ; i<sentences.length;i++){
            String s = sentences[i];
            for(int j = 0;j<s.length();j++){
                if(s.charAt(j) == ' ') count ++;
            }
            max=Math.max(max,count);
            count=0;
        }
        return max+1;
    }
}