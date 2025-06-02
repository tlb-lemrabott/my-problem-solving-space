https://leetcode.com/problems/rotate-list/description/?envType=problem-list-v2&envId=m3r184od


public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) return head;
    // Compute the length and connect the tail to head to form a circle
    ListNode oldTail = head;
    int length = 1;
    while (oldTail.next != null) {
        oldTail = oldTail.next;
        length++;
    }
    oldTail.next = head; // Form a cycle
    // Find new tail: (length - k % length - 1)th node
    // and new head: (length - k % length)th node
    int stepsToNewHead = length - (k % length);
    ListNode newTail = head;
    for (int i = 0; i < stepsToNewHead - 1; i++) {
        newTail = newTail.next;
    }
    ListNode newHead = newTail.next;
    newTail.next = null; // Break the circle
    return newHead;
}

