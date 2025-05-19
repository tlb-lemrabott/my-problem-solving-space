public int fibo(int n){
    if(n <= 1) return n;
    int []dp = new int[n+1];
    dp[0] = 0;
    dp[1] = 1;
    for(int i=2; i<=n; i++){
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
}

//Using HashMap with DP
public int fibo(int n){
    if(n <= 1) return n;
    HashMap<Integer, Integer> memo = new HashMap<>();
    if(memo.containsKey(n)) return memo .get(n);
    int result = fib(n-1) + fib(n - 2);
    memo.put(n, result);
    return result;
}