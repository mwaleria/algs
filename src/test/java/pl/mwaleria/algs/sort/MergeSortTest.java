package pl.mwaleria.algs.sort;

import java.util.List;

/**
 * Created by walema1 on 28.06.2017.
 */
public class MergeSortTest extends AbstractSortTest{

    @Override
    public <T extends Comparable<T>> void sortList(List<T> list) {
        MergeSort.sort(list);
    }

    @Override
    public <T extends Comparable<T>> void sortArray(T[] array) {
        BubbleSort.sort(array);
    }

}