/**
 * Beck 
 * MatNr: 1329591 
 * Exercise 1-2
 */

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;


public class RingBufferMutationTest {

	RingBuffer<String> rb;
	String element1 = "Software";
	String element2 = "Testing";
	
	@Before
	public void setUpRingBuffer() {
		rb = new RingBuffer<String>(3);
	}
	
	@Test
	public void testEnqueueThenDequeueOnBuffer() {
		rb.enqueue(element1);
		assertEquals(rb.dequeue(), element1);
	}
	
	@Test
	public void testEnqueueThenDequeueThenEnqueueOnBuffer() {
		rb.enqueue(element1);
		rb.dequeue();
		rb.enqueue(element2);
		assertEquals(rb.dequeue(), element2);
	}
	
	@Test
	public void testNumberOfElementsOnBuffer() {
		rb.enqueue(element1);
		rb.dequeue();
		assertEquals(0, rb.size());
	}
	
	@Test
	public void testNextElement() {
		rb.enqueue(element1);
		rb.enqueue(element2);
		Iterator<String> a = rb.iterator();
		a.next();
		String nextVal = a.next();
		assertEquals(nextVal, element2);
	}
	
}
