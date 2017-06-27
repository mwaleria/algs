package pl.mwaleria.algs.sort;

import pl.mwaleria.algs.ds.BinaryHeap;

import java.util.List;

/**
 * @author <a href="mailto:Walerianczyk.Marcin@gmail.com">Marcin Walerianczyk</a>
 */
public class HeapSort {
    public static <T extends Comparable<T>> void sort(List<T> elements) {
        if(elements == null) {
            throw new IllegalArgumentException("List to sort cannot be null.");
        }
        BinaryHeap<T> heap = new BinaryHeap<>();
        for(T t : elements) {
            heap.insert(t);
        }
        for(int i = elements.size()-1 ; i>=0 ; i--) {
            elements.set(i,heap.pool());
        }

    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        if(array == null) {
            throw new IllegalArgumentException("Array to sort cannot be null.");
        }
        BinaryHeap<T> heap = new BinaryHeap<>();
        for(T t : array) {
            heap.insert(t);
        }
        for(int i = array.length -1  ; i >= 0 ; i--) {
            array[i] = heap.pool();
        }
    }
}
