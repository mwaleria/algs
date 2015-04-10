package pl.mwaleria.algs.ds;

/**
 * Created by Marcin on 11.04.2015.
 */
public interface Heap<T extends Comparable<T>> {

    void insert(T element);
    /**
     * get and remove min value
     * @return
     */
    T pool();

    /**
     * get min value
     * @return
     */
    T peek();
    int size();
}
