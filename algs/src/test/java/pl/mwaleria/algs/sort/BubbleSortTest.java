package pl.mwaleria.algs.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by waler on 13/04/2015.
 */
public class BubbleSortTest {

    @Test
    public void testSortList() {
        List<Integer> elements = new ArrayList<>();
        elements.add(5);
        elements.add(3);
        elements.add(4);
        elements.add(6);
        elements.add(2);
        BubbleSort.sort(elements);
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
        BubbleSort.sort( nullList);
    }

    @Test
    public void testSortSortedList() {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        BubbleSort.sort(elements);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        SortTestUtils.assertListEquals(expectedList, elements);
    }
}
