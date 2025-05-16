public int getMin(int []arr){
    int min = Integer.MAX_VALUE;
    for(int i=0; i<arr[i]; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
    return min;
}

public int getMax(int []arr){
    int max = Integer.MIN_VALUE;
    for(int i=0; i<arr[i]; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    return max;
}
