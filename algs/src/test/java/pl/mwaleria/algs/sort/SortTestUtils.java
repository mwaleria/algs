package pl.mwaleria.algs.sort;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by waler on 13/04/2015.
 */
public class SortTestUtils {

    public static <T extends Comparable<T>> void assertListEquals(List<T> expected, List<T> actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.size(),actual.size());
        for(int i=0 ; i < expected.size(); i++) {
            assertEquals("Elements are not equal on [" +i +"] position, expected="+expected.get(i)+" actual = "+actual.get(i) ,0,expected.get(i).compareTo(actual.get(i)));
        }
    }

    public static <T extends Comparable<T>> void assertArrayEquals(T[] expected, T[] actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.length, actual.length);
        for(int i=0 ; i < expected.length ; i++) {
            assertEquals("Elements are not equal on [" +i +"] position, expected="+expected[i]+" actual="+actual[i],0,expected[i].compareTo(actual[i]));
        }

    }

}
