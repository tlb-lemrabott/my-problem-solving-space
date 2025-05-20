

public int findPreviousMax(int []nums){
    int max = Integer.MIN_VALUE;
    int previous = Integer.MIN_VALUE;
    for(int i=0; i<nums.length; i++){
        if(nums[i] > max){
            previous = max;
            max = num[i];
        }else if(nums[i] > previous && nums[i] < max){
            previous = nums[i];
        }
    }
    return previous;
}