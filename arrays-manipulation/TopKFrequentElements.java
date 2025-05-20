https://leetcode.com/problems/top-k-frequent-elements/

public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num : nums){
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
        (a, b) -> b.getValue() - a.getValue()
    );
    maxHeap.addAll(map.entrySet());
    int []result = new int[k];
    for(int i=0; i<k; i++){
        result[i] = maxHeap.poll().getKey();
    }
    return result;
}