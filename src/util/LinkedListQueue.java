package util;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedListQueue<E> implements Queue<E>{
    private LinkedList<E> Linked;

    public LinkedListQueue() {
        Linked = new LinkedList<E>();
    }

    @Override
    public void enqueue(E item) {
        Linked.addFirst(item);
    }

    @Override
    public E dequeue() {
        if (Linked.isEmpty())
            throw new EmptyStackException();

        return Linked.removeLast();
    }

    @Override
    public E peak() {
        if (Linked.isEmpty())
            throw new EmptyStackException();

        return Linked.getLast();
    }

    @Override
    public boolean isEmpty() {
        return Linked.isEmpty();
    }
}
