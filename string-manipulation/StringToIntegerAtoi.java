https://leetcode.com/problems/string-to-integer-atoi/description/?envType=problem-list-v2&envId=m3r184od


public int myAtoi(String s) {
    if (s == null || s.length() == 0) return 0;
    int i = 0, n = s.length();
    while (i < n && s.charAt(i) == ' ') {
        i++;
    }
    int sign = 1;
    if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
        sign = s.charAt(i) == '-' ? -1 : 1;
        i++;
    }
    long result = 0;
    while (i < n && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0';
        result = result * 10 + digit;
        if (sign == 1 && result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (sign == -1 && -result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        i++;
    }
    return (int)(sign * result);
}
