package pl.mwaleria.algs.sort;

import java.util.List;

/**
 * Created by walema1 on 28.06.2017.
 */
public class HeapSort2Test extends  AbstractSortTest{

    @Override
    public <T extends Comparable<T>> void sortList(List<T> list) {
        HeapSort2.sort(list);
    }

    @Override
    public <T extends Comparable<T>> void sortArray(T[] array) {
        HeapSort.sort(array);
    }
}