https://leetcode.com/problems/power-of-two/description/

public boolean isPowerOfTwo(int n) {
    int x = 31;
    while (x >= 0){
        if(Math.pow(2, x) == n){
            System.out.println(x);
            return true;
        }
        x--;
    }
    return false;
}

public boolean isPowerOfTwoUsingXAND(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}