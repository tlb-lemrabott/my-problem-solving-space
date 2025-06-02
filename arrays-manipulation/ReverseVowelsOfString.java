https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75

public String reverseVowels(String s) {
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    char[] chars = s.toCharArray();
    int left = 0, right = s.length() - 1;

    while (left < right) {
        while (left < right && !vowels.contains(chars[left])) left++;
        while (left < right && !vowels.contains(chars[right])) right--;

        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;

        left++;
        right--;
    }

    return new String(chars);
}
