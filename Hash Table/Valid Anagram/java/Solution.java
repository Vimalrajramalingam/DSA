class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[]=new int[28];
        for(char a1:s.toCharArray()){
            freq[a1-'a']++;
        }
        int sum=0;
        for(char a2:t.toCharArray()){
            if(freq[a2-'a']!=0)freq[a2-'a']--;
        }
        for(int i:freq)
        {   
            sum+=i;
        }
        System.out.print(sum);
        if(sum==0){
            return true;
        }
        return false;
    }
}