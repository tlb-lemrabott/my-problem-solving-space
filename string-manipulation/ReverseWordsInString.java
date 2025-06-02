https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75


public String reverseWords(String s) {
    String output = "";
    String word = "";
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (ch != ' ') {
            word += ch;
        } else {
            if (!word.isEmpty()) {
                output = word + (output.isEmpty() ? "" : " ") + output;
                word = "";
            }
        }
    }
    if (!word.isEmpty()) {
        output = word + (output.isEmpty() ? "" : " ") + output;
    }
    return output;
}