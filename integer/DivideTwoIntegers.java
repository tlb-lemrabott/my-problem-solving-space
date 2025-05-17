https://leetcode.com/problems/divide-two-integers/description/

int divide(int dividend, int divisor) {
    if(dividend == Integer.MIN_VALUE && divisor = -1){
        return Integer.MAX_VALUE;
    }
    boolean isNegative = (dividend < 0) ^ (divisor < 0);
    long a = Math.abs((long) dividend);
    long b = Math.abs((long) divisor);
    int result = 0;
    while (a >= 0){
        a -= b;
        result++;
    }
    return isNegative ? -result : result;
}