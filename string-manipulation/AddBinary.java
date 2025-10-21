// https://leetcode.com/problems/add-binary/description/
// Adds two binary strings and returns the binary sum.
public static String addBinary(String a, String b) {
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    StringBuilder sb = new StringBuilder(Math.max(a.length(), b.length()) + 1);

    while (i >= 0 || j >= 0 || carry != 0) {
        int bitA = (i >= 0) ? (a.charAt(i) - '0') : 0;
        int bitB = (j >= 0) ? (b.charAt(j) - '0') : 0;
        int sum = bitA + bitB + carry;

        sb.append((char) ('0' + (sum & 1)));
        carry = sum >> 1;
        i--; j--;
    }

    return sb.reverse().toString();
}
