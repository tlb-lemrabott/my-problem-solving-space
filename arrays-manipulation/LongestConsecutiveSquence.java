https://leetcode.com/problems/longest-consecutive-sequence/description/

public int longestConsecutive(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for(int num : nums){
        set.add(num);
    }
    int count = 0;
    for(int num : set){
        if(!set.contains(num - 1)){
            int currentNum = num;
            int currentCount = 1;
            while(set.contains(currentNum + 1)){
                currentNum++;
                currentCount++;
            }
            count = Math.max(count, currentCount);
        }
    }
    return count;
}
