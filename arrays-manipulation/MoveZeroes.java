https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75

public void moveZeroes(int[] nums) {
    int index = 0;
    for (int num : nums) {
        if (num != 0) {
            nums[index++] = num;
        }
    }
    while (index < nums.length) {
        nums[index++] = 0;
    }
}
