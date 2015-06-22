/**
 * Beck 
 * MatNr: 1329591 
 * Exercise 1-2
 */

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;


public class RingBufferTestCoverage {

	RingBuffer<String> rb;
	String element = "Software";
	
	@Before
	public void setUpRingBuffer() {
		rb = new RingBuffer<String>(3);
	}
	
	
	@Test
	public void testEnqueueToEmptyBuffer() {
		rb.enqueue(element);
		assertEquals(1, rb.size());
	}

	@Test
	public void testDequeueFromEnqueuedBuffer() {
		rb.enqueue(element);
		assertEquals("Software", rb.dequeue());
	}
		
	@Test
	public void testBufferIsEmpty() {
		boolean rbe = false;
		rbe = rb.isEmpty();
		assertTrue(rbe);
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testNextOnEmptyBuffer_throwsNoSuchElementException() {
		rb.iterator().next();
	}
	
	@Test(expected=RuntimeException.class)
	public void testEnqueueBufferToOverflow_throwsRuntimeException() {
		rb.enqueue(element);
		rb.enqueue(element);
		rb.enqueue(element);
		rb.enqueue(element);
	}
	
	@Test(expected=RuntimeException.class)
	public void testDequeueBufferToUnderflow_throwsRuntimeException() {
		rb.dequeue();
	}
	
	@Test
	public void testHasNotNext() {
		assertFalse(rb.iterator().hasNext());
	}
	
	@Test
	public void testHasNext() {
		rb.enqueue(element);
		assertTrue(rb.iterator().hasNext());
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testRemove_throwsUnsupportedOperationException() {
		rb.iterator().remove();
	}
	
	@Test
	public void testNext() {
		rb.enqueue(element);
		String xxx = rb.iterator().next();
		assertEquals("Software", xxx);
	}
}
