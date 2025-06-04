https://leetcode.com/problems/contains-duplicate/description/?envType=problem-list-v2&envId=m3r184od

public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        if (!set.add(num)) return true;
    }
    return false;
}