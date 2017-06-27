package pl.mwaleria.algs.sort;

import java.util.List;

/**
 * Created by walema1 on 27.06.2017.
 */
public class QuickSort1Test extends AbstractSortTest{

    @Override
    public <T extends Comparable<T>> void sortList(List<T> list) {
        QuickSort1.sort(list);
    }

    @Override
    public <T extends Comparable<T>> void sortArray(T[] array) {
        BubbleSort.sort(array);
    }
}