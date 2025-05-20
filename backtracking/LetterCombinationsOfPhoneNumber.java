https://leetcode.com/problems/letter-combinations-of-a-phone-number/?envType=problem-list-v2&envId=m3r184od

public List<String> letterCombinations(String digits) {
    if (digits == null || digits.length() == 0) return new ArrayList<>();
    
    String[] mapping = {
        "",     "",     "abc", "def", "ghi", 
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    
    List<String> result = new ArrayList<>();
    backtrack(digits, 0, new StringBuilder(), result, mapping);
    return result;
}

private void backtrack(String digits, int index, StringBuilder current, List<String> result, String[] mapping) {
    if (index == digits.length()) {
        result.add(current.toString());
        return;
    }
    
    String letters = mapping[digits.charAt(index) - '0'];
    for (char c : letters.toCharArray()) {
        current.append(c);
        backtrack(digits, index + 1, current, result, mapping);
        current.deleteCharAt(current.length() - 1);
    }
}
