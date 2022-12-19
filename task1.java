class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder finalResult = new StringBuilder();
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                finalResult.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                finalResult.append(word2.charAt(j++));
            }
        }

        return finalResult.toString();
    }
}
