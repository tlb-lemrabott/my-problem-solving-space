https://leetcode.com/problems/swap-nodes-in-pairs/description/?envType=problem-list-v2&envId=m3r184od

public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode current = dummy;

    while (current.next != null && current.next.next != null) {
        ListNode first = current.next;
        ListNode second = current.next.next;

        first.next = second.next;
        second.next = first;
        current.next = second;

        current = first;
    }

    return dummy.next;
}