package pl.mwaleria.algs.ds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marcin on 11.04.2015.
 */
public class BinaryHeapTest {

    Heap<Integer> heap;

    @Before
    public void setUp() throws Exception {
        heap = new BinaryHeap<>();
    }

    @Test
    public void testInsert() throws Exception {
        for(int i =0 ; i < 100 ; i++) {
            heap.insert(i);
        }
        assertEquals(100,heap.size());
        assertEquals(new Integer(0),heap.peek());
    }

    @Test
    public void testPeek() {
        heap.insert(2);
        heap.insert(10);
        assertEquals(new Integer(2), heap.peek());
        assertEquals(new Integer(2),heap.peek());
    }

    @Test
    public void testPool() {
        heap.insert(2);
        heap.insert(10);
        assertEquals(new Integer(2), heap.pool());
        assertEquals(new Integer(10),heap.pool());
        assertNull(heap.peek());
    }

    @Test
    public void testSize() {
        heap.insert(2);
        heap.insert(10);
        assertEquals(2, heap.size());
        heap.insert(4);
        assertEquals(3, heap.size());
        heap.insert(6);
        assertEquals(4, heap.size());
        heap.pool();
        assertEquals(3, heap.size());
    }

}