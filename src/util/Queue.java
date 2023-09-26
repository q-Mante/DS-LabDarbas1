package util;

public interface Queue<E> {
    /**
     * For adding a new element to the end of the queue (Amortized asymptotic complexity not greater than O(1)).
     * @param item new element
     */
    public abstract void enqueue (E item);

    /**
     * For removing and returning the element at the front of the queue (Amortized asymptotic complexity not greater than O(1)).
     * @return the element at the front of the queue
     */
    public abstract E dequeue();

    /**
     * For returning the element at the front of the queue (Asymptotic complexity not greater than O(1)).
     * @return element at the front of the queue
     */
    public abstract E peak();

    /**
     * For checking if the queue is empty (Asymptotic complexity not greater than O(1)).
     * @return boolean
     */
    public boolean isEmpty();
}
