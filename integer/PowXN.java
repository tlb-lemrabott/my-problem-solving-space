https://leetcode.com/problems/powx-n/description/?envType=problem-list-v2&envId=m3r184od

public double myPow(double x, int n) {
    long number = n;
    if (number < 0) {
        x = 1 / x;
        number = -number;
    }
    double res = 1;
    while (number > 0) {
        if ((number & 1) == 1) res *= x;
        x *= x;
        number >>= 1;
    }
    return res;
}
