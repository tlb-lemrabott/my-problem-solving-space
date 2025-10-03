//Determine the number of valid words in a given string input. 
//A valid word contains at least 3 characters with only alphnumeric characters(i.e., the numbers 0-9, leters A-Z in either case),
//at least one vowel ('a', 'e', 'i', 'o', 'u'), and at least one consonant.
//Example supose the String input = "This is an example string 234".
//Function description:
//Complete the function countValidWords in the editor
public int countValidWords(String input){
    if(input == null || input.isEmpty()){
        return 0;
    }
    String[] words = input.split("\\s+");
    int count = 0;
    for(String word : words){
        if(isValidWord(word)){
            count++;
        }
    }
    return count;
}

private boolean isValidWord(String word){
    if(word.length() < 3) return false;
    if(!word.matches("[a-zA-Z0-9]+")) return false;
    boolean hasVowel = false;
    boolean hasConsonant = false;
    String vowels = "aeiouAEIOU";
    for(char c : word.toCharArry()){
        if(Character.isLetter(c)){
            if(vowels.indexOf(c) != -1){
                hasVowel = true;
            }else{
                hasConsonant = true;
            }
        }
    }
    return hasVowel && hasConsonant;
}