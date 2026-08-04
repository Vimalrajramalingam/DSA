class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> rowMap = new HashMap<>();
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                rowMap.put(c, i);
            }
        }
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            
            String lowerCaseWord = word.toLowerCase();
            int firstCharRow = rowMap.get(lowerCaseWord.charAt(0));
            boolean isValid = true;
            
            for (char c : lowerCaseWord.toCharArray()) {
                if (rowMap.get(c) != firstCharRow) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }

    
}