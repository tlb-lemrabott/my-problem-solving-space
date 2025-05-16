https://leetcode.com/problems/palindrome-linked-list/description/

public boolean isPalindrome(ListNode head) {
    List<Integer> list = new LinkedList<>();
    while(head != null){
        list.add(head.value);
        head = head.next;
    } 
    int left = 0;
    int right = list.size() - 1;
    while(left < right){
        if(list.get(left) != list.get(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}