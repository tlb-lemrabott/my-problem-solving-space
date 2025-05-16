https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public int strStr(String haystack, String needle) {
    for(int i=0; i<= haystack.length() - needle.length(); i++){
        String currentSubString = haystack.substring(i, i + needle.length());
        if(currentSubString.equals(needle)){
            return i;
        }
    }
    return -1;
}