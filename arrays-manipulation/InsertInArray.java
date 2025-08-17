
public void insertElementInSortedArray(int arr[], int k){
    for(int i=0; i<arr.length; i++){
        if(arr[i] > k){
            int temp = arr[i];
            arr[i] = k;
            k = temp;
        }
    }
}