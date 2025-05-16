public int[] convertNumberToArray(int n){
    if(n == 0) return new int[]{0}; 
    int length = (int) Math.log10(n) + 1;
    int [] arr = new int[length];
    for(int i=arr.length-1; i>=0; i--){
        arr[i] = n % 10;
        n = n / 10;
    }
    return arr;
}


