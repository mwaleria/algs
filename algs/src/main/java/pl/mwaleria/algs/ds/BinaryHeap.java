package pl.mwaleria.algs.ds;

import java.util.Arrays;

/**
 * Created by Marcin on 11.04.2015.
 */
public class BinaryHeap<T extends Comparable<T>> implements Heap<T> {

    private int size ;

    private int capacity ;

    private Comparable<T>[] values;

    private static final int DEFAULT_CAPACITY = 16;

    public BinaryHeap(final int initialCapacity) {
        capacity = initialCapacity;
        size = 0;
        values = new Comparable[capacity];
    }

    public BinaryHeap() {
        this(DEFAULT_CAPACITY);
    }

    public void insert(T element) {
        int i = size;
        size = size +1;
        adjustCapacity();
        int j = ( i-1 ) % 2 ;

        while(i > 0 && element.compareTo((T)values[j]) > 0) {
            values[i] = values[j];
            i=j;
             j = (i-1) % 2;
        }
        values[i] = element;
    }

    private void adjustCapacity() {
        if(size > capacity ) {
            capacity = capacity * 2;
            values = Arrays.copyOf(values,capacity);
        }

    }

    @Override
    public T pool() {
        if(size ==0 ) {
            return null;
        }

        T minElement = (T) values[0];
        size -- ;
        Comparable<T> v = values[size];
        int i = 0;
        int j = 1;
        while ( j < size) {
            if( j+1 < size && values[j+1].compareTo((T)values[j]) > 0) {
                j = j+1;
            }
            if(v.compareTo((T) values[j]) >= 0) {
                break;
            }
            values[i] = values[j];
            i = j;
            j = 2*j +1;
        }
        values[i] = v;

        return minElement;
    }

    @Override
    public T peek() {
        if(size > 0)
            return (T) values[0];

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ;
    }
}
