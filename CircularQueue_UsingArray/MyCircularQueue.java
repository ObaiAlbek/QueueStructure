package QueueStructure.CircularQueue_UsingArray;

public class MyCircularQueue <T> {
	
	private T wert;
	private T arr[];
	private int erst;// oder (Head, first, begin)
	private int last; // oder (back,last,tail,end)
	private int size;
	
	private int zaeler = 0; // checke für die länge meiner Queue 
	
	MyCircularQueue(int size) {
		this.size = size;
		arr =(T[]) new Object[size];
		initi_werte();
	}
	
	public void initi_werte() {
		erst = -1;
		last = -1;
	}
	
	public T enqeueu(T value) throws MyException{
		
		this.wert = value;
		if(isEmpty())
			erst++;
		
		zaeler++;
		last = (last + 1) % size;
		arr[last] = value;
		
		return arr[last];
	}
	
	public boolean dequeue() {
		if(isEmpty())
			return false;
		
		zaeler--;
		erst = (erst + 1) % size;
		erst++;
		return true;
	}
	
	public T getFront()throws MyException {
		if(isEmpty())
			throw new MyException("Queue ist leer");
		
		return arr[erst];
	}
	
	public T getRear()throws MyException {
		if(isEmpty())
			throw new MyException("Queue ist leer");
		
		return arr[last];
	}
	
	public boolean isFull() { 
		return last >= arr.length - 1;
	}
	
	public boolean isEmpty() {
		return erst == -1 && last == -1;
	}
	
	public boolean clear() {
		if (!isEmpty()) {
			initi_werte();
			return true;
		}
		return false;	
	}
	
	public int getsize() {
		if (isEmpty())
			return -1;
		
		return zaeler;
	}
}
