// compare if two Strings have at least one similar char


public boolean hasCommonChar(String s1, String s2){
    HashMap<Character, Character> map = new HashMap<>();
    for(int i=0; i<s1.length(); i++){
        map.put(s1.charAt(i), s1.charAt(i));
    }
    for(int i=0; i<s2.length(); i++){
        if(map.containsKey(s2.charAt(i))) return true;
    }
    return false;
}