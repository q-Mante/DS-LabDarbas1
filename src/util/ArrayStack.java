package util;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {

    private ArrayList<E> Array;

    public ArrayStack() {
        Array = new ArrayList<>();
    }

    @Override
    public E pop() {
        int len = Array.size();

        if (len == 0)
            throw new EmptyStackException();

        //E temp = Array.get(len - 1);
        return Array.remove(len - 1);
    }

    @Override
    public void push(E item) {
        Array.add(item);
    }

    @Override
    public E peak() {
        int len = Array.size();

        if (len == 0)
            throw new EmptyStackException();

        return Array.get(len - 1);
    }

    @Override
    public boolean isEmpty() {
        return Array.isEmpty();
    }
}
