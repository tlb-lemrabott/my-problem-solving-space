https://leetcode.com/problems/word-pattern/?envType=problem-list-v2&envId=m3r184od

public boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");
    if (words.length != pattern.length()) return false;

    Map<Character, String> charToWord = new HashMap<>();
    Map<String, Character> wordToChar = new HashMap<>();

    for (int i = 0; i < pattern.length(); i++) {
        char c = pattern.charAt(i);
        String w = words[i];

        if (charToWord.containsKey(c)) {
            if (!charToWord.get(c).equals(w)) return false;
        } else {
            if (wordToChar.containsKey(w)) return false;
            charToWord.put(c, w);
            wordToChar.put(w, c);
        }
    }
    return true;
}
