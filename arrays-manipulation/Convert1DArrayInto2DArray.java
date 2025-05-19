https://leetcode.com/problems/convert-1d-array-into-2d-array/

public int[][] construct2DArray(int[] original, int m, int n) {
    if(original.length != n * m) return new int[0][0];
    int[][] result = new int[n][m];
    for(int i=0; i<original.length; i++){
        result[i/n][i%n] = original[i];
    }
    return result;
}