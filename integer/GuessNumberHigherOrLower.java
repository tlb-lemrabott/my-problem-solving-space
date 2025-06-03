https://leetcode.com/problems/guess-number-higher-or-lower/?envType=problem-list-v2&envId=m3r184od

public int guessNumber(int n) {
    int left = 1, right = n;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        int res = guess(mid);
        if (res == 0) return mid;
        else if (res < 0) right = mid - 1;
        else left = mid + 1;
    }
    return -1;
}