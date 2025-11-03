package QueueStructure;

public class MyQueue {
	int wert;
	int erst;
	int last;
	int arr[];

	MyQueue(int size) {
		arr = new int[size];
		erst = -1;
		last = -1;
	}

	public int enqueue(int value) throws MyException  {
		if (isFull())
			throw new MyException ("Kein Platz mehr in der Queue");
		this.wert = value;
		
		if (erst == -1)
			erst++;
		
		last++;
		arr[last] = wert;
		return arr[last];
		
	}
	
	
	public void deqeue() throws MyException {
		if (isEmpty())
			throw new MyException ("Queue ist leer!");
		
		if (erst == last) {
			erst = -1;
			last = -1;
			return;
		}
		erst++;
			
	}
	
	public int peek() throws MyException {
		if (isEmpty())
			throw new MyException ("Queue ist leer!");
		
		return arr[erst];
	}
	
	public boolean isEmpty() {
		return last == -1 && erst == -1;
	}
	
	public boolean isFull() {
		return last >= arr.length-1;
	}
	
	
	public void printAll() throws MyException {
		if (isEmpty())
			throw new MyException ("Queue ist leer!");
		System.out.print("[");
		for (int i = erst; i < last; i++)
			System.out.print(arr[i] + " ");
		
		System.out.print("]");
	}

}
