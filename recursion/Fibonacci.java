// https://leetcode.com/problems/fibonacci-number/description/

public static int findFibonacci(int n){
    if(n <= 1){
        return n;
    }else{
        return findFibonacci(n-1) + findFibonacci(n-2);
    }
}