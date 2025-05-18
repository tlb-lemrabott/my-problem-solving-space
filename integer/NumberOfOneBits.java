https://leetcode.com/problems/number-of-1-bits/description/

public int hammingWeight(int n){
    if(n == 0) return 0;
    int count = 0;
    while(n != 0){
        if((n & 1) == 1){
            count++;
        }
        n >>> 1;
    }
    return count;
}

public int hammingWeight(int n) {
    if (n == 0) return 0;
    int length = 0;
    int temp = n;
    while(temp > 0){
        length++;
        temp = temp / 2;
    }
    int []binary = new int[length];
    for(int i=length-1; i>=0; i--){
        binary[i] = n % 2;
        n = n / 2;
    }
    int count = 0;
    for(int i=0; i<length; i++){
        if(binary[i] == 1){
            count++;
        }
    }
}