//Add Solution for #RemoveDuplicatesFromArray problem.
public int[] removeDuplicates(int arr[]){
    Set<Integer> set = new LinkedHashSet<>();
    for(int num : arr){
        set.add(num);
    }
    int []result = new int[set.size()];
    int i = 0;
    for(int num : set){
        result[i++] = num;
    }
    return result;
}