package QueueStructure;

public class Main {

	public static void main(String[] args) throws MyException {
		MyQueue test = new MyQueue(5);
		try {
			test.enqueue(10);
			test.enqueue(120);
			test.enqueue(140);
			test.enqueue(140);
			test.enqueue(140);
			
			test.printAll();
		} catch (MyException e) {
			System.out.println(e.toString() + e.getClass());
		}
		System.out.println(3 % 5);
	}
}
