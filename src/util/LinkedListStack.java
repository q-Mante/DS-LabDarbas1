package util;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> Linked;

    public LinkedListStack() {
        Linked = new LinkedList<>();
    }

    @Override
    public E pop() {
        if (Linked.isEmpty())
            throw new EmptyStackException();

        //E temp = Linked.getFirst();
        return Linked.removeFirst();
    }

    @Override
    public void push(E item) {
        Linked.addFirst(item);
    }

    @Override
    public E peak() {
        if (Linked.isEmpty())
            throw new EmptyStackException();

        return Linked.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return Linked.isEmpty();
    }
}
