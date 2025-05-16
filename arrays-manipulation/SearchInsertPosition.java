https://leetcode.com/problems/search-insert-position/description/

// Input: nums = [1,3,5,6], target = 5 - Output: 2
// Input: nums = [1,3,5,6], target = 2 - Output: 1
// Input: nums = [1,3,5,6], target = 7 - Output: 4

class Solution {
    public int searchInsert(int[] arr, int target) {
        int targetIndex = 0;
        if(target > arr[arr.length-1]){
            targetIndex = arr.length;
        }
        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                targetIndex = i;
            }else if(target > arr[i]){
                targetIndex = i+1;
            }
        }
        return targetIndex;
    }

    public int searchInsertBST(int[] arr, int target) {
        int left = 0;
        int right = 0;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
    
}