https://leetcode.com/problems/number-complement/description/?envType=problem-list-v2&envId=m3r184od

public int findComplement(int num) {
    int mask = (Integer.highestOneBit(num) << 1) - 1;
    return ~num & mask;
}