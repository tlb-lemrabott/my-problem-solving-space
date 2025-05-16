// Note: Array must be sorted
// BS is faster than linear search except for small arrays


public static int binarySearch(int[] arr, int target) {
    Arrays.sort(arr);
    int left = 0;
    int right = arr.length - 1;
    while(left <= right){
        int mid = left + (right - left)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] < target){
            left = mid+1;
        }else{
            right = mid-1;
        }
    }
    return -1;
}

// [1, 2, 3, 4, 5]
// 4;
