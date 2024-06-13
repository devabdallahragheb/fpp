package lab8.prob2;

public class LinkedListStack {

    private final GenericLinkedList<Integer> listStack = new GenericLinkedList<Integer>();

    public void push(Integer value) {
        listStack.addFirst(value);
    }

    public Integer peek() {
        return listStack.isEmpty() ? null : listStack.head.value;
    }

    public Integer pop() {
        return listStack.removeFirst();
    }

    public boolean isEmpty() { // true if stack is empty
        return listStack.isEmpty();
    }

    public int size() { // returns number of items in the stack
        return listStack.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack: ");
        stringBuilder.append(listStack);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        System.out.println(STR."Stack is empty: \{stack.isEmpty()}");
        System.out.println(STR."Peek: \{stack.peek()}");
        stack.pop();
        System.out.println(stack);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(STR."Size = \{stack.size()}");
        System.out.println(stack);
        System.out.println(STR."Stack is empty: \{stack.isEmpty()}");
        System.out.println(STR."Peek: \{stack.peek()}");
        System.out.println(STR."Pop: \{stack.pop()}");
        System.out.println(stack);
    }
}