public int firstNonRepeatingElement(int arr[]){
    Map<Integer, Integer> mapElement = new HashMap<>();
    for(int i=0; i<arr.length; i++){
        mapElement.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    for(Map<Integer, Integer> entry: entrySet()){
        if(map.get(entry) == 1){
            return entry;
        }
    }
    return -1;
}