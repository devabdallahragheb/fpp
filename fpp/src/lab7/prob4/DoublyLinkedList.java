package lab7.prob4;


public class DoublyLinkedList {
    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    //1. adds to the end of the list
    public void addLast(String item) {
        Node newNode = new Node();
        newNode.value = item;
        if (header.next == null) {
            header.next = newNode;
            newNode.previous = header;
        } else {
            Node temp = header.next;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
        }
    }

    // 2. Remove by passing object
    public boolean removeFirstMatch(String item) {
        if (header.next == null || item == null) {
            return false;
        }
        Node temp = header.next;
        while (temp != null) {
            if (temp.value.equals(item)) {
                Node next = temp.next;
                Node prev = temp.previous;
                prev.next = next;
                if (next != null)
                    next.previous = prev;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    // 3. Remove the First Node
    public boolean removeFirstNode() {
        if (header.next == null) {
            return false;
        }
        Node firstNode = header.next;
        header.next = firstNode.next;
        if (firstNode.next != null)
            firstNode.next.previous = header;
        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {
        StringBuilder sb = new StringBuilder();
        toStringReverse(sb, getLast());
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();
    }

    private void toString(StringBuilder stringBuilder, Node node) {
        if (node == null)
            return;
        if (node.value != null) {
            stringBuilder.append(" ").append(node.value);
        }
        toString(stringBuilder, node.next);
    }

    private Node getLast() {
        if (header.next == null)
            return null;
        Node temp = header.next;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    private void toStringReverse(StringBuilder stringBuilder, Node node) {
        if (node == null)
            return;
        if (node.value != null) {
            stringBuilder.append(" ").append(node.value);
        }
        toStringReverse(stringBuilder, node.previous);
    }


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Michael");
        list.addLast("Alex");
        list.addLast("Steve");
        System.out.println(list);

        // Print reverse original list
        list.printReverse();

        // 2. Remove first match
        System.out.println(STR."Remove Cris: \{list.removeFirstMatch("Cris")}");

        // Print  list after removing Steve
        System.out.println(STR."Remove Steve: \{list.removeFirstMatch("Steve")}");
        System.out.println(list);
        list.printReverse();

        // Print  list after removing first node
        System.out.println(STR."Remove first node: \{list.removeFirstNode()}");
        System.out.println(list);
        list.printReverse();
    }

    private class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

}

