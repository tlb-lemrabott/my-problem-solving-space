public static int longestContiguousSubsequence(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);
    }
    int maxLength = 0;
    for (int num : nums) {
        if (!set.contains(num - 1)) {
            int currentNum = num;
            int count = 1;
            while (set.contains(currentNum + 1)) {
                currentNum++;
                count++;
            }
            maxLength = Math.max(maxLength, count);
        }
    }
    return maxLength;
}