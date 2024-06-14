package lab8.prob1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] array = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return array[front];
    }

    public void enqueue(int input) {
        if (isEmpty()) {
            front = 0;
        }
        array[rear] = input;
        rear++;
        if (rear >= array.length) {
            resize();
        }

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = array[front];
        int[] temp = new int[rear];
        System.arraycopy(array, front + 1, temp, 0, rear - 1);
        array = temp;
        return result;
    }

    public boolean isEmpty() {
        return front < 0;
    }

    public int size() {
        return rear;
    }

    private void resize() {
        int newLength = 2 * array.length;
        array = Arrays.copyOf(array, newLength);
    }

    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();
        System.out.println(STR."Queue is empty: \{queue.isEmpty()}");

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);

        System.out.println(STR."Dequeue: \{queue.dequeue()}");
        System.out.println(STR."Peek: \{queue.peek()}");


    }
}
