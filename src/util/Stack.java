package util;

public interface Stack<E> {
    /**
     * For removing and returning the first element from the stack (Asymptotic complexity not greater than O(1))
     * @return first element from the stack
     */
    public abstract E pop();

    /**
     * For inserting a new element at the beginning of the stack (Amortized asymptotic complexity not greater than O(1)).
     * @param item inserting a new element
     */
    public abstract void push(E item);

    /**
     * For returning the first element from the stack (Asymptotic complexity not greater than O(1)).
     * @return first element from the stack
     */
    public abstract E peak();

    /**
     * For checking if the stack is empty (Asymptotic complexity not greater than O(1)).
     * @return boolean
     */
    public abstract boolean isEmpty();
}