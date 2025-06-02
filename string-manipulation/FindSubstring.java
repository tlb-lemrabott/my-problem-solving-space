https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/?envType=problem-list-v2&envId=m3r184od

public List<Integer> findSubstring(String s, String[] words) {
    List<Integer> result = new ArrayList<>();
    if (s == null || words == null || words.length == 0) return result;
    int wordLen = words[0].length();
    int wordCount = words.length;
    int totalLen = wordLen * wordCount;
    int n = s.length();
    if (n < totalLen) return result;
    Map<String, Integer> wordMap = new HashMap<>();
    for (String word : words) {
        wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
    }
    for (int i = 0; i < wordLen; i++) {
        int left = i, count = 0;
        Map<String, Integer> seen = new HashMap<>();
        for (int j = i; j + wordLen <= n; j += wordLen) {
            String word = s.substring(j, j + wordLen);
            if (wordMap.containsKey(word)) {
                seen.put(word, seen.getOrDefault(word, 0) + 1);
                count++;
                while (seen.get(word) > wordMap.get(word)) {
                    String leftWord = s.substring(left, left + wordLen);
                    seen.put(leftWord, seen.get(leftWord) - 1);
                    count--;
                    left += wordLen;
                }
                if (count == wordCount) {
                    result.add(left);
                }
            } else {
                seen.clear();
                count = 0;
                left = j + wordLen;
            }
        }
    }
    return result;
}
