package exercise03;

public class Temp {

	public static <Item> void main(String[] args) {
		// TODO Auto-generated method stub
		RingBufferWrapper<Item> rbw = new RingBufferWrapper<Item>();
		
		boolean isEmpty = rbw.isEmpty();
		System.out.println("The Buffer is really empty: " + isEmpty);
		
		boolean bufferSizeIsTwo = 2 == rbw.size();
		System.out.println("The BufferSize really is 2: " + bufferSizeIsTwo);
		
	}

}
