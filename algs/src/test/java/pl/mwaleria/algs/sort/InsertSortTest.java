package pl.mwaleria.algs.sort;

import java.util.List;

/**
 * @author <a href="mailto:Walerianczyk.Marcin@gmail.com">Marcin Walerianczyk</a>
 */
public class InsertSortTest extends AbstractSortTest {
    @Override
    public <T extends Comparable<T>> void sortList(List<T> list) {
        InsertSort.sort(list);
    }

    @Override
    public <T extends Comparable<T>> void sortArray(T[] array) {
        InsertSort.sort(array);
    }
}
