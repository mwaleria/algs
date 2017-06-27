package pl.mwaleria.algs.ds;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	
	
	private Stack<Integer> queue;
	
	@Before
	public void init() {
		queue  = new Stack<Integer>();
	}

	@Test
	public void testPushAndPop() {
		assertEquals(0,queue.size());
		queue.push(1);
		assertEquals(1,queue.size());
		assertEquals(Integer.valueOf(1),queue.pop());
		assertEquals(0,queue.size());
		
	}

	@Test
	public void testPopEmptyQueue() {
		assertNull(queue.pop());
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		assertEquals(0, queue.size());
	}

	@Test
	public void testPushNull() {
		assertEquals(0, queue.size());
		queue.push(null);
		queue.push(null);
		queue.push(null);
		assertEquals(3, queue.size());
		assertNull(queue.pop());
		assertEquals(2, queue.size());
		assertNull(queue.pop());
		assertEquals(1, queue.size());
		assertNull(queue.pop());
		assertEquals(0, queue.size());
		
	}

	@Test
	public void testToArray() {
		Object[] array = queue.toArray();
		assertEquals(0, array.length);
		queue.push(1);
		array = queue.toArray();
		assertEquals(1, array.length);
		assertEquals(Integer.valueOf(1), queue.pop());
		array = queue.toArray();
		assertEquals(0, array.length);
	}
	
	@Test
	public void testContains() {
		queue.push(null);
		assertFalse(queue.contains(null));
		queue.push(2);
		queue.push(3);
		queue.push(4);
		assertTrue(queue.contains(2));
		assertTrue(queue.contains(3));
		assertTrue(queue.contains(4));
		assertFalse(queue.contains(5));
	}

}
