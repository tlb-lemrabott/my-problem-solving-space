https://leetcode.com/problems/add-digits/?envType=problem-list-v2&envId=m3r184od

public int addDigits(int num) {
    return num == 0 ? 0 : 1 + (num - 1) % 9;
}