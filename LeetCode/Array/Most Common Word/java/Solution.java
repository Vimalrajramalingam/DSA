class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
          Set<String> bannedWords = new HashSet<>();
        for (String word : banned) {
            bannedWords.add(word.toLowerCase());
        }

        Map<String, Integer> wordCounts = new HashMap<>();
        String normalizedParagraph = paragraph.toLowerCase().replaceAll("[^a-z0-9]", " ");
        String[] words = normalizedParagraph.split("\\s+"); 

        for (String word : words) {
            if (!word.isEmpty() && !bannedWords.contains(word)) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        String mostCommonWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostCommonWord = entry.getKey();
            }
        }
        return mostCommonWord;

    }
}