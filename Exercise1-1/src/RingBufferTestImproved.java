/**
 * Beck 
 * MatNr: 1329591 
 * Exercise 1-1
 */

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;


public class RingBufferTestImproved {

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
	
}
