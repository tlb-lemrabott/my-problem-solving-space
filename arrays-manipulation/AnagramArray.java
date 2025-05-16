//Anagram if they have the same element
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

public boolean isAnagramArray(int []arr1, int []arr2){
    Map<Integer, Integer> map = new HashMap<>();
    for(int num : arr1){
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for(int num : arr2){
        if(!map.containsKey(num)) return false;
        map.put(num, map.get(num) - 1);
        if(map.get(num) == 0) map.remove(num);
    }
    return map.isEmpty();
}

public boolean isAnagramSortedArrays(int []arr1, int []arr2){
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for(int i=0; i<arr1.length; i++){
        if(arr1[i] != arr2[i]) return false;
    }
    return true;
}