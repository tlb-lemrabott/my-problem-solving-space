https://leetcode.com/problems/arranging-coins/description/?envType=problem-list-v2&envId=m3r184od


public int arrangeCoins(int n) {
    long left = 0, right = n;
    while (left <= right) {
        long mid = left + (right - left) / 2;
        long sum = mid * (mid + 1) / 2;
        if (sum == n) return (int) mid;
        if (sum < n) left = mid + 1;
        else right = mid - 1;
    }
    return (int) right;
}