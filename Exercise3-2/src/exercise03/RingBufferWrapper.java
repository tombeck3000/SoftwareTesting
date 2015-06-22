package exercise03;

public class RingBufferWrapper<Item> {
	
	//RingBufferVariable
	RingBuffer<Item> rb;
	
	//Constructor
	public RingBufferWrapper() {
		this.rb = new RingBuffer<Item>(5);
	}
	
	//Delegates with asserts
	public boolean isEmpty() {
		assert rb.size() == 0;
		return rb.isEmpty();
	}

	public int size() {
		assert rb.isEmpty() == true;
		return rb.size();
	}

	public void enqueue(Item item) {
		assert rb.size() == 0;
		rb.enqueue(item);
		assert rb.size() == 1;
	}

	public Item dequeue() {
		assert rb.size() > 0;
		return rb.dequeue();
	}

	

}
