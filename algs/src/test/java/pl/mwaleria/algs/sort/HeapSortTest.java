package pl.mwaleria.algs.sort;

import pl.mwaleria.algs.ds.Heap;

import java.util.List;

/**
 * @author <a href="mailto:Walerianczyk.Marcin@gmail.com">Marcin Walerianczyk</a>
 */
public class HeapSortTest extends AbstractSortTest {
    @Override
    public <T extends Comparable<T>> void sortList(List<T> list) {
        HeapSort.sort(list);
    }

    @Override
    public <T extends Comparable<T>> void sortArray(T[] array) {
        HeapSort.sort(array);
    }
}
