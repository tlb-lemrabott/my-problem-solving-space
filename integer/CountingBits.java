https://leetcode.com/problems/counting-bits/?envType=problem-list-v2&envId=m3r184od

public int[] countBits(int n) {
    int[] ans = new int[n + 1];
    for (int i = 1; i <= n; i++)
        ans[i] = ans[i >> 1] + (i & 1);
    return ans;
}
