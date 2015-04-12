package pl.mwaleria.algs.ds;

/**
 * Created by Marcin on 11.04.2015.
 */
public interface Heap<T extends Comparable<T>> {

    void insert(T element);
    /**
     * get and remove max value
     * @return
     */
    T pool();

    /**
     * get max value
     * @return
     */
    T peek();

    /**
     *
     * @return size of the heap
     */
    int size();

    /**
     *
     * @return true heap is empty;
     */
    boolean isEmpty();
}
