// https://leetcode.com/problems/factorial-trailing-zeroes/description/

public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n > 0){
            n = n / 5;
            count += n;
        }
        return count;
    }
}
