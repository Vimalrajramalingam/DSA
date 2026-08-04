class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder rev=new StringBuilder();
        for(String word:words)
        {
            StringBuilder revword=new StringBuilder(word);
            rev.append(revword.reverse()).append(" ");
        }
        return rev.toString().trim();
    }
}