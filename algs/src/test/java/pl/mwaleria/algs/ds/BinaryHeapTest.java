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
        assertEquals(new Integer(99),heap.peek());
    }

    @Test
    public void testPeek() {
        heap.insert(2);
        heap.insert(10);
        assertEquals(new Integer(10), heap.peek());
        assertEquals(new Integer(10),heap.peek());
    }

    @Test
    public void testPeek2() {
        heap.insert(7);
        assertEquals(new Integer(7), heap.peek());
        heap.insert(1);
        assertEquals(new Integer(7), heap.peek());
        heap.insert(10);
        assertEquals(new Integer(10), heap.peek());

    }


    @Test
    public void testPool2() {
        heap.insert(2);
        heap.insert(10);
        heap.insert(4);
        heap.insert(8);
        heap.insert(6);

        assertEquals(new Integer(10), heap.pool());
        assertEquals(new Integer(8), heap.pool());
        assertEquals(new Integer(6), heap.pool());
        assertEquals(new Integer(4), heap.pool());
        assertEquals(new Integer(2), heap.pool());
        assertNull(heap.pool());

    }

    @Test
    public void testPool() {
        heap.insert(2);
        heap.insert(10);
        assertEquals(new Integer(10), heap.pool());
        assertEquals(new Integer(2),heap.pool());
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

    @Test
    public void testHeapWithCustomClass() {
        Item item1 = new Item(20,2000);
        Item item2 = new Item(20,1999);
        Item item3 = new Item(21,2001);
        Item item4 = new Item(20,2001);
        Heap<Item> itemHeap = new BinaryHeap<>();
        itemHeap.insert(item1);
        itemHeap.insert(item2);
        itemHeap.insert(item3);
        itemHeap.insert(item4);
        assertEquals(4, itemHeap.size());

        assertEquals(item4, itemHeap.pool());
        assertEquals(item1, itemHeap.pool());
        assertEquals(item2, itemHeap.pool());
        assertEquals(item3, itemHeap.pool());




    }

    private static class Item implements Comparable<Item> {
        private int price;
        private int yearOfProduction;

        public Item(int price, int yearOfProduction) {
            this.price = price;
            this.yearOfProduction = yearOfProduction;
        }

        @Override
        public int compareTo(Item o) {
            if(this.price > o.price) {
                return -1;
            } else if(this.price < o.price) {
                return 1;
            } else {
                if( this.yearOfProduction < o.yearOfProduction) {
                    return -1;
                } else if (this.yearOfProduction > o.yearOfProduction) {
                    return 1;
                }
            }
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Item item = (Item) o;

            if (price != item.price) return false;
            return yearOfProduction == item.yearOfProduction;

        }

        @Override
        public int hashCode() {
            int result = price;
            result = 31 * result + yearOfProduction;
            return result;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "price=" + price +
                    ", yearOfProduction=" + yearOfProduction +
                    '}';
        }
    }

}