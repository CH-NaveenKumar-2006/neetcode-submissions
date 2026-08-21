class LinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;

    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        Node current = head;

        for (int i = 0; i < index; i++) {
            if (current == null) {
                return -1;
            }
            current = current.next;
        }

        if (current == null) {
            return -1;
        }

        return current.val;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public boolean remove(int index) {

        if (head == null || index < 0) {
            return false;
        }

        // Remove head
        if (index == 0) {
            head = head.next;
            return true;
        }

        Node current = head;

        // Move to node before target
        for (int i = 0; i < index - 1; i++) {
            if (current.next == null) {
                return false;
            }

            current = current.next;
        }

        // Index out of bounds
        if (current.next == null) {
            return false;
        }

        // Remove target node
        current.next = current.next.next;

        return true;
    }

    public ArrayList<Integer> getValues() {

        ArrayList<Integer> result = new ArrayList<>();

        Node current = head;

        while (current != null) {
            result.add(current.val);
            current = current.next;
        }

        return result;
    }
}