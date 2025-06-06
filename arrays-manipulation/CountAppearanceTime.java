public static HashMap<Integer, Integer> countAppearanceTime(int []nums){
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num : nums){
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    return map;
}

// int []arr = map.values().stream().mapToInt(x -> x).toArray();