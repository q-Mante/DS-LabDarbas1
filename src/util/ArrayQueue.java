package util;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayQueue<E> implements Queue<E> {
    private ArrayList<E> Array;
    private int front;
    private int rear;

    public ArrayQueue() {
        Array = new ArrayList<>();
        front = 0;
        rear = -1;
    }

    @Override
    public void enqueue(E item) {
        Array.add(++rear, item);
    }

    @Override
    public E dequeue() {
        if (front > rear)
            throw new EmptyStackException();

        E old = Array.set(front++, null);

        int dataSize = rear - front + 1;
        // resize the array to maximize available memory
        if (dataSize <= (Array.size() * 3/4)) {
            ArrayList<E> newArray = new ArrayList<>(dataSize);
            for (int i = front; i <= rear; i++) {
                newArray.add(Array.get(i));
            }
            Array = newArray;
            front = 0;
            rear = dataSize - 1;
        }

        return old;
    }

    @Override
    public E peak() {
        return Array.get(front);
    }

    @Override
    public boolean isEmpty() {
        return front > rear;
    }
}
