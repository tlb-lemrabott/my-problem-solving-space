// https://leetcode.com/problems/letter-case-permutation/description/

import java.util.List;
import java.util.ArrayList;

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String s, int index, StringBuilder current, List<String> result) {
        if (index == s.length()) {
            result.add(current.toString());
            return;
        }
        if (Character.isLetter(s.charAt(index))) {
            current.append(Character.toLowerCase(s.charAt(index)));
            backtrack(s, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
            current.append(Character.toUpperCase(s.charAt(index)));
            backtrack(s, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        } else {
            current.append(s.charAt(index));
            backtrack(s, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
