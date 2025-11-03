package QueueStructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JTest {
	
	MyQueue test;
	
	@BeforeEach
	void erstelle_List() {
		test = new MyQueue(5);
	}
	
	@Test
	public void test_Enqueue() throws MyException {
		
		
		assertEquals(10,test.enqueue(10));
		assertEquals(120,test.enqueue(120));
	}
	
	@Test
	public void test_isfull() throws MyException {
		test.enqueue(10);
		test.enqueue(10);
		test.enqueue(10);
		test.enqueue(10);
		test.enqueue(10);
		assertTrue(test.isFull());
		
	}
	
	@Test
	public void test_isempty() throws MyException {
		
		assertTrue(test.isEmpty());
		
	}

}
