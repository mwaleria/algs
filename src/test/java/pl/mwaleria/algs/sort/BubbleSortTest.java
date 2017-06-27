package pl.mwaleria.algs.sort;


import java.util.List;

/**
 * Created by waler on 13/04/2015.
 */
public class BubbleSortTest extends AbstractSortTest {


    @Override
    public <T extends Comparable<T>> void sortList(List<T> list) {
        BubbleSort.sort(list);
    }

    @Override
    public <T extends Comparable<T>> void sortArray(T[] array) {
        BubbleSort.sort(array);
    }
}
