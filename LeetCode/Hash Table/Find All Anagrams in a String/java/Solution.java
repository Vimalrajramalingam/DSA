class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res=new ArrayList<>();
        int[] s1count=new int[26];
        int[] s2count=new int[26];
        for(char str:p.toCharArray()){
            s1count[str-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            s2count[s.charAt(i)-'a']++;
            if(i>=p.length()){
                s2count[s.charAt(i-p.length())-'a']--;
            }
            if(matches(s1count,s2count))
            {
                res.add(i-p.length()+1);
            }
        }
        return res;
    }
    private boolean matches(int[] s1count,int[] s2count){
        for(int i=0;i<26;i++)
        {
            if(s1count[i]!=s2count[i]){
                return false;
            }
           
        }
        return true;
    }
}