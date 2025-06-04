https://leetcode.com/problems/reverse-linked-list/submissions/1654133304/?envType=problem-list-v2&envId=m3r184od

public ListNode reverseList(ListNode head) {
    ListNode current = head;
    ListNode previous = null;
    while(current != null){
        ListNode next = current.next;
        current.next = previous;
        previous = current;
        current = next;
    }
    return previous;
}