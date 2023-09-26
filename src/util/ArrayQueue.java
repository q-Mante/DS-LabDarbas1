package util;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayQueue<E> implements Queue<E> {
    private ArrayList<E> Array;
    private int front;
    private int rear;

    public ArrayQueue() {
        Array = new ArrayList<>(16);
        front = rear = 0;
    }

    @Override
    public void enqueue(E item) {
        Array.add(rear++, item);
    }

    @Override
    public E dequeue() {
        if (front > rear)
            throw new EmptyStackException();

        return Array.get(front++);
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
