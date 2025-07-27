// Fetch all the duplicate values from an array

public static List<Integer> findDuplicates(int[] arr) {
    Set<Integer> seen = new HashSet<>();
    Set<Integer> duplicates = new HashSet<>()
    for (int num : arr) {
        if (!seen.add(num)) {
            // If add returns false, it's already seen → duplicate
        duplicates.add(num);
    }    
    return new ArrayList<>(duplicates);
}
