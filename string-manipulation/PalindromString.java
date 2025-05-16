https://leetcode.com/problems/valid-palindrome/description/

// String str = "madam";  // This is a palindrome

//String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

public boolean isPalindromeUsingStringBuilder(String s) {
    String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
    StringBuilder sb = new StringBuilder(cleaned);
    return sb.reverse().toString().equals(cleaned);
}

public boolean isPalindromeUsingTwoPointers(String s) {
    String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
    int left = 0;
    int right = cleaned.length() - 1;
    while(left < right){
        if(cleaned.charAt(left) != cleaned.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}