https://leetcode.com/problems/remove-linked-list-elements/?envType=problem-list-v2&envId=m3r184od

public ListNode removeElements(ListNode head, int val) {
    ListNode temp = new ListNode(0);
    temp.next = head;
    ListNode current = temp;
    
    while (current.next != null) {
        if (current.next.val == val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    
    return temp.next;
}