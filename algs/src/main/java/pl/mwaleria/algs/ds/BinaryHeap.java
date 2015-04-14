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
        size = size +1;
        adjustCapacity();
        values[size] = element;
        upheap(size);
    }

    private void adjustCapacity() {
        if(size+1 > capacity ) {
            capacity = capacity * 2;
            values = Arrays.copyOf(values,capacity);
        }

    }

    @Override
    public T pool() {
        if(size==0) {
            return null;
        }
        T max =(T) values[1];
        values[1] = values[size];
        size --;
        downheap(1);

        return max;
    }

    @Override
    public T peek() {
        if(size > 0)
            return (T) values[1];

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

    protected void downheap(int elementIndex) {
        int j = 2*elementIndex;
        while(j <= size) {
            if(j < size && values[j].compareTo((T)values[j+1]) < 0) {
                j++;
            }
            if(values[elementIndex].compareTo((T)values[j]) >= 0) {
                break;
            }

            exchange(elementIndex,j);
            elementIndex = j;
            j = 2*elementIndex;
        }
    }

    protected void upheap(int elementIndex){
        while(elementIndex > 1 && values[elementIndex/2].compareTo((T)values[elementIndex]) < 0) {
            exchange(elementIndex,elementIndex/2);
            elementIndex = elementIndex / 2 ;
        }
    }

    protected void exchange(final int i, final int j) {
        Comparable<T> tmp  =values[j];
        values[j] = values[i];
        values[i] = tmp;
    }
}
