package pl.mwaleria.algs.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by waler on 14/04/2015.
 */
public abstract class AbstractSortTest {


    public abstract <T extends Comparable<T>> void sortList(List<T> list);

    public abstract <T extends Comparable<T>> void sortArray(T[] array);

    @Test
    public void testSortList() {
        List<Integer> elements = new ArrayList<>();
        elements.add(5);
        elements.add(3);
        elements.add(4);
        elements.add(6);
        elements.add(2);
        sortList(elements);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(4);
        expectedList.add(5);
        expectedList.add(6);
        SortTestUtils.assertListEquals(expectedList,elements);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSortNullList(){
        List<Integer> nullList = null;
        sortList(nullList);
    }

    @Test
    public void testSortSortedList() {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        sortList(elements);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        SortTestUtils.assertListEquals(expectedList, elements);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullArray() {
        sortArray(null);
    }

    @Test
    public void testSortSortedArray() {
        Integer[] array = {1,2,3,4,5};
        Integer[] expected = {1,2,3,4,5};
        sortArray(array);
        SortTestUtils.assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArray() {
        Integer[] array = {5,2,1,4,3};
        Integer[] expected = {1,2,3,4,5};
        sortArray(array);
        SortTestUtils.assertArrayEquals(expected,array);
    }
}
