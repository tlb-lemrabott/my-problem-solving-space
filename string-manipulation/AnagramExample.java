public class AnagramExample{
// if they have the same characters
    public boolean isAnagramArray(int []arr1, int []arr2){
        if(arr1.length != arr2.length) return false;
        boolean []visited = new boolean[arr1.length];
        for(int i=0; i<arr1.length; i++){
            boolean found;
            for(int j=0; j<arr2.length; j++){
                if(!visisted[j] && arr1[i] != arr2[j]){
                    found = true;
                    visited[j] = true;
                    break;
                }
            }
            if(!boolean) return false;
        }
        return true;
    }

    public boolean isAnagramStringArray(String []arr1, String []arr2){
        if(arr1.length != arr2.length) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<arr1.length; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        for(int i=0; i<arr2.length; i++){
            if(!map.containsKey(arr2[i])) return false;
            map.put(arr2[i], map.get(arr[i]) - 1);
            if(map.get(arr2[i]) == 0) map.remove(arr2[i]);
        }
        return map.isEmpty();
    }

    public boolean isAnagramString(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for(int i=0; i<str2.length(); i++){
            if(!map.containsKey(str2.charAt(i))) return false;
            map.put(str2.charAt(i), map.get(str2.charAt(i)) -1);
            if(map.get(str2.charAt(i)) == 0) map.remove(str2.charAt(i));
        }

        return map.isEmpty();
    }

}