class Solution {
    public String reformat(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                letters.append(ch);
            }else if(Character.isLetter(ch)){
                digits.append(ch);
            }
        }
        if(Math.abs(letters.length() - digits.length()) > 1){
            return "";
        }
        StringBuilder largerGrp = letters.length() >= digits.length() ? letters : digits;
        StringBuilder smallerGrp = letters.length() < digits.length() ? letters : digits;
        StringBuilder res = new StringBuilder();
        int i = 0, j = 0;
        while(i < largerGrp.length() || j < smallerGrp.length()){
            if(i < largerGrp.length()) res.append(largerGrp.charAt(i++));
            if(j < smallerGrp.length()) res.append(smallerGrp.charAt(j++));
        }

        return res.toString();
    }
}