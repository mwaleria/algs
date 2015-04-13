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
            assertEquals(0,expected.get(i).compareTo(actual.get(i)));
        }
    }
}
