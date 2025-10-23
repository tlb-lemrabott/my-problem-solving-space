// Find the First Non-Repeating Character in a String
// Given a string, find the first non-repeating character in it and return its index. If it doesn’t exist, return -1.
// Example questions:
// Consider a string where all characters are lowercase alphabets.
// Example 1:
// Input:
// s = 'helloworld'
// Output:
// first_uniq_char(s) -> 0
// In the string ‘helloworld’, the first non-repeating character is ‘h’, which is at index 0.
// Example 2:
// Input:
// s = 'concussion'
// Output:
// first_uniq_char(s) -> 4
// In the string ‘concussion’, the first non-repeating character is ‘u’, which is at index 4.

public int first_uniq_char(String s) {
      if (s == null || s.length() == 0) return -1;

      int[] freq = new int[26]; // for 'a'..'z'
      for (int i = 0; i < s.length(); i++) {
          freq[s.charAt(i) - 'a']++;
      }

      for (int i = 0; i < s.length(); i++) {
          if (freq[s.charAt(i) - 'a'] == 1) return i;
      }
      return -1;
  }