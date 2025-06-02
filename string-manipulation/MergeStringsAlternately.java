https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

public String mergeAlternately(String word1, String word2) {
    String merge = "";
    int length = Math.min(word1.length(), word2.length());
    for(int i = 0; i<length; i++){
        merge += word1.charAt(i) +""+ word2.charAt(i);
    }
    if(word1.length() == length){
        for(int i= length; i<word2.length(); i++){
            merge += word2.charAt(i);
        }
    }
    if(word2.length() == length){
        for(int i= length; i<word1.length(); i++){
            merge += word1.charAt(i);
        }
    }
    return merge;
}
