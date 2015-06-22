/**
 * Beck 
 * MatNr: 1329591 
 * Exercise 0
 */

import org.junit.Test;
import junit.framework.TestCase;



public class RingBufferTest extends TestCase {
	
	@Test
	public void testEnqueue() {
		
		RingBuffer<String> rb = new RingBuffer<String>(3);
		rb.enqueue("Software");
		assertEquals(1, rb.size());
	}

	@Test
	public void testDequeue() {
				
		RingBuffer<String> rb = new RingBuffer<String>(3);
		rb.enqueue("Software");
		assertEquals("Software", rb.dequeue());
	}
		
	@Test
	public void testIsEmpty() {
		
		boolean rbe = false;
		RingBuffer<String> rb = new RingBuffer<String>(3);
		rbe = rb.isEmpty();
		assertTrue(rbe);
	}
	
	@Test
	public void testNext() {
		
		RingBuffer<String> rb = new RingBuffer<String>(3);
		rb.enqueue("Software");
		assertEquals("Software", rb.iterator().next());
	}
	
}
