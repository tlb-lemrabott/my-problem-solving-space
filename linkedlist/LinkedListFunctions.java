private static Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}

// inputHead hear represent of input LinkedList, which I want to insert in the newNode(val)
public Node insertNodeLastPosition(Node inputHead, int val){
    Node newNode = new Node(val);
    if(inputHead == null){
        return newNode;
    }
    Node current = inputHead;
    while(current.next != null){
        current = current.next;
    }
    current.next = newNode;
    return inputHead;
}

public Node insertNodeAtFirst(Node inputHead, int val){
    Node newNode = new Node(val);
    newNode.next = inputHead;
    return newNode;
}


public Node insertAtPosition(Node inputHead, int val, int position){
    Node newNode = new Node(val);
    if(inputHead == null){
        return newNode;
    }
    if(inputHead != null && position == 0){
        newNode.next = inputHead;
        return newNode;
    }
    Node current = inputHead;
    int index = 0;
    while(current != null && index < position - 1){
        current = current.next;
        index++;
    }
    if(current == null){
        System.out.println("Position out of bounds.");
        return inputHead;
    }
    newNode.next = current.next;
    current.next = newNode;
    return inputHead;
}

public Node removeNode(Node inputHead, int position){
    if(inputHead == null){
        throw new IllegalArgumentException();
    }
    if(inputHead != null && position = 0){
        inputHead = inputHead.next;
        return inputHead;
    }
    Node current = inputHead;
    int index = 0;
    while(current != null && index < position - 1){
        current = current.next;
        inde++;
    }
    if(current == null || current.next == null){
        throw new IndexOutOfBoundsException("position not exist");
    }
    current.next = current.next.next;
    return inputHead;
}

public Node removeLastNode(Node inputHead){
    if(inputHead == null){
        throw new IllegalArgumentException();
    }
    if(inputHead.next = null){
        inputHead = null;
        return inputHead;
    }
    Node current = inputHead;
    while(current.next.next != null){
        current = current.next;
    }
    current.next = null;
    return inputHead;
}

public void readLinkedList(Node inputHead){
    Node current = inputHead;
    if(current == null) {
        System.out.print("input is empty");
        return;
    }
    while(current != null){
        System.out.print(current.val + " ");
        current = current.next; 
    }
    System.out.println();
}

public Node findNodeAtPosition(Node inputHead, int position){
    if(inputHead == null || position < 0){
        return null;
    }
    Node current = inputHead;
    int index = 0;
    while(current != null){
        if(index == position){
            return current;
        }
        current = current.next;
        index++;
    }
    if(current == null){
        sout("Index out of bouds")
    }
    return null;
}

public Node reverseList(Node inputHead) {
    Node current = inputHead;
    Node previous = null;
    while(current != null){
        Node next = current.next;
        current.next = previous;
        previous = current;
        current = next;
    }
    return inputHead;
}

public boolean hasCycle(Node inputHead) {
    Node slow = inputHead;
    Node fast = inputHead;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
        }
    }
    return false;
}

public Node findStartOfCycle(Node inputHead){
    Node slow = inputHead;
    Node fast = inputHead;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            break;
        }
    }
    if(fast == null || fast.next == null) return null;
    slow = inputHead;
    while(slow != fast){
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
}

public Node findMiddleNode(Node inputHead){
    if(inputHead == null) return null;
    Node slow = inputHead;
    Node fast = inputHead;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}	


Remove by value