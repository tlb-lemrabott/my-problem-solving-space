https://leetcode.com/problems/delivering-boxes-from-storage-to-ports/?envType=problem-list-v2&envId=queue


public int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
    int n = boxes.length;
    int[] dp = new int[n + 1];
    int j = 0, weight = 0, trips = 0;
    Deque<Integer> deque = new ArrayDeque<>();
    for (int i = 0; i < n; i++) {
        if (i == 0 || boxes[i][0] != boxes[i - 1][0]) {
            trips++;
        }
        weight += boxes[i][1];
        while (i - j + 1 > maxBoxes || weight > maxWeight || (j < i && dp[j] == dp[j + 1])) {
            weight -= boxes[j][1];
            if (boxes[j][0] != boxes[j + 1][0]) trips--;
            j++;
        }
        dp[i + 1] = dp[j] + trips + 1;
    }
    return dp[n];
}