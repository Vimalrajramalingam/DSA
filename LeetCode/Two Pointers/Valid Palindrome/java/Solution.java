class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder();
        String sr=new StringBuilder(str).reverse().toString();
        if(!str.equals(sr) ){
            return false;
        }
        return true;
    }
}