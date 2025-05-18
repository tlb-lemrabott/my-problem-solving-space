// https://leetcode.com/problems/climbing-stairs/description/?envType=problem-list-v2&envId=m3r184od

public int climbingStairs(int n) {
    if(n <= 2) return n;
    int []dp = new int[n];
    dp[1] = 1;
    dp[2] = 2;
    for(int i=3; i<=n; i++){
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
}
