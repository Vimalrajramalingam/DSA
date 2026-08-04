class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[]=new int[26];
        for(char a1:s.toCharArray()){
            freq[a1-'a']++;
        }
        int sum=0;
        for(char a2:t.toCharArray()){
            freq[a2-'a']--;
        }
        for(int i:freq)
        {   
            if(i!=0) return false;
        }
        
        return true;
    }
}