// Remove Zeros from Array and return the new size.
// Add solution for #RemoveZerosFromArray problem 
public int[] removeZeros(int []arr){
    HashMap<Integer, Integer> map = new LinkedHashMap<>();
    for(int i=0; i<arr.length; i++){
        if(arr[i] != 0){
            map.put(i, arr[i]);
        }
    }
    int []result = new int[map.size()];
    int i = 0;
    for(Integer value : map.values()){
        result[i+1] = value;
    }
    return result;
}