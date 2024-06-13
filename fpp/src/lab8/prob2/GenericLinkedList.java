package lab8.prob2;

public class GenericLinkedList<T> {
    Node head;

    class Node {
        T value;
        Node next;
    }

    public GenericLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void addFirst(T value) {
        Node newNode = new Node();
        newNode.value = value;
        if (!isEmpty()) {
            newNode.next = head;
        }
        head = newNode;
    }

    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node removedNode = head;
        head = head.next;
        return removedNode.value;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(" ");
            sb.append(current.value);
            current = current.next;
        }
        return sb.toString();
    }
}
