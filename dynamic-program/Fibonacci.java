public int fibo(int n){
    if(n <= 1) return n;
    int []arr = new int[n+1];
    arr[0] = 0;
    arr[1] = 1;
    for(int i=0; i<=n; i++){
        arr[i] = arr[i-1] + arr[i-2];
    }
    return arr[n];
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