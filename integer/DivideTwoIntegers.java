https://leetcode.com/problems/divide-two-integers/description/

public int divide(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return Integer.MAX_VALUE;
    }
    boolean isNegative = (dividend < 0) ^ (divisor < 0);
    long a = Math.abs((long) dividend);
    long b = Math.abs((long) divisor);
    int result = 0;
    while (a >= b) {
        long temp = b;
        int multiple = 1;
        while (a >= (temp << 1)) {
            temp <<= 1;
            multiple <<= 1;
        }
        a -= temp;
        result += multiple;
    }
    return isNegative ? -result : result;
}



public int divideSmall(int dividend, int divisor) {
    if(dividend == Integer.MIN_VALUE && divisor == -1){
        return Integer.MAX_VALUE;
    }
    boolean isNegative = (dividend < 0) ^ (divisor < 0);
    long a = Math.abs((long) dividend);
    long b = Math.abs((long) divisor);
    int result = 0;
    while (a >= b){
        a -= b;
        result++;
    }
    return isNegative ? -result : result;
}