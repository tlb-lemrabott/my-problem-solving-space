public static HashMap<Integer, Integer> countAppearanceTime(int []nums){
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num : nums){
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    return map;
}

// int []arr = map.values().stream().mapToInt(x -> x).toArray();


public static HashMap<Integer, Integer> countAppearanceTime(int []nums){
    HashMap<Integer, Integer> counterMap = new HashMap<>();
    for(int num : nums){
        counterMap.put(num, counterMap.getOrDefault(num, 0) + 1);
    }
    return counterMap;
}

for(Map.Entry<Integer, Integer> entry : counterMap.entrySet()){
    System.out.print(entry.getKey() + ", " + entry.getValue());
}


