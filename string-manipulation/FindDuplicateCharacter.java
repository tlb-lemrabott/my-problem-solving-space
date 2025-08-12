public static HashMap<Character, Integer> findDuplicateCharacter(String str){
        HashMap<Character, Integer> duplicates = new HashMap<>();
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == ' ') continue;
            duplicates.put(str.charAt(i), duplicates.getOrDefault(str.charAt(i), 0) + 1);
        }
        return duplicates;
    }

    public static void main(String[] args) {
        HashMap<Character, Integer> duplicates = findDuplicateCharacter("hello words");
        for(Map.Entry<Character, Integer> entry : duplicates.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }