// Best: O(n) | Average: O(n^2) | Worst: O(n^2)

public void BubbleSort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
        boolean swapped = false;
        for(int j=0; j<arr.length-i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
        }
        if(!swapped) break;
    }
}

public void BubbleSortRecursive(int arr[]){
    
}