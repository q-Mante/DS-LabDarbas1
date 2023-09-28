package tasks;

import util.Ks;

import java.util.ArrayDeque;
import java.util.Locale;

public class SecondTask {

    public static int[] maxValues(int[] array, int m) {
        if (array == null || m <= 0 || m > array.length) {
            return new int[0];
        }

        int n = array.length;
        int[] result = new int[n - m + 1];
        int resultIndex = 0;

        // in deque we are saving indices of the initial array
        // and grabbing values from it using these indices.
        // At the front we store the biggest element's index.
        // At the back we store the "smallest" element's index.
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // it may look like a O(n*m) algorithm but in reality we don't save all indices for given m elements in segment.
        for (int i = 0; i < n; i++) {

            // remove elements that are out of the current segment
            // (segment shifted further than where are old elements,
            // so we need to remove them, they do not belong to the new segment).
            while (!deque.isEmpty() && deque.peekFirst() < i - m + 1) {
                deque.pollFirst();
            }

            // remove elements smaller than the current element
            // (recent element is bigger than previous, so we can forget smaller elements
            // because it will last longer than those smaller elements in this new numbers segment.
            // It can also replace our current first element which is the biggest at the moment).
            while (!deque.isEmpty() && array[i] >= array[deque.peekLast()]) {
                deque.pollLast();
            }

            // add the current element's index to the deque
            // (if it's the biggest then deque will be empty by the previous while loop
            // and the element will be added at the back which is also the front.
            // If it's not the biggest it will be the smallest at the deque because previous loop removed all other
            // smaller elements compared to the new element).
            deque.offerLast(i);

            // add the maximum element for the current window to the result.
            if (i >= m - 1) {
                result[resultIndex++] = array[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // suvienodiname smaičių formatus pagal LT lomalę (10-ainis mablelis)
        Locale.setDefault(new Locale("LT"));

        int[] array = {1, -3, -7, -3, -5, 3, 6, 7};
        int m = 3;
        int[] result = maxValues(null, m);
        for (int num : result) {
            Ks.oun(num);
        }
    }
}
