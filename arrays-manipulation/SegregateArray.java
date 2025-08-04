public void segregateArray(int[] arr) {
    int []result = new int[arr.length];
    int k=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i] < 0){
            result[k++] = arr[i];
        }
    }
    for(int i=0; i<arr.length; i++){
        if(arr[i] > 0){
            result[k++] = arr[i];
        }
    }
    for(int i=0; i<arr.length; i++){
        arr[i] = result[i];
    }
}