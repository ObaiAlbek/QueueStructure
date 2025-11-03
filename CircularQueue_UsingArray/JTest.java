package QueueStructure.CircularQueue_UsingArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import QueueStructure.MyQueue;

class JTest {
	MyCircularQueue<Integer> test;
	
	@BeforeEach
	void erstelle_List() {
		test = new MyCircularQueue<>(6);
	} 
	
	@Test
	void test_Enqueue() throws MyException {

		assertEquals(1,test.enqeueu(1));
	}
	
	@Test
	void test_getFront() throws MyException {
		test.enqeueu(4);
		test.enqeueu(2);
		test.enqeueu(6);
		assertEquals(4,test.getFront());
	}
	
	@Test
	void test_getRear() throws MyException {
		test.enqeueu(4);
		test.enqeueu(2);
		test.enqeueu(6);
		assertEquals(6,test.getRear());
	}
	
	@Test
	void test_dequeue() throws MyException {
		test.enqeueu(4);
		test.enqeueu(2);
		test.enqeueu(6);
		assertTrue(test.dequeue());
	}
	
	@Test
	void test_clear() throws MyException {
		test.enqeueu(4);
		test.enqeueu(2);
		test.enqeueu(6);
		assertTrue(test.clear());
	}
	
	@Test 
	void test_getSize() throws MyException {

		test.enqeueu(6);
		assertEquals(1,test.getsize());
	}
}
