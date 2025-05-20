https://leetcode.com/problems/remove-nth-node-from-end-of-list/?envType=problem-list-v2&envId=m3r184od

public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;
    
    for (int i = 0; i <= n; i++) {
        first = first.next;
    }
    
    while (first != null) {
        first = first.next;
        second = second.next;
    }
    
    second.next = second.next.next;
    return dummy.next;
}