package queue;

public class QueueDemo {
	
	private int[] queue;
	
	private int size;
	private int front;
	private int rear;
	
	
	
	public QueueDemo(int size) {
		super();
		queue = new int[size];
		
		
	}



	public void enQueue(int data) {
		
		queue[rear]=data;
		rear++;
		size++;
		
	}

	public int deQueue() {
		
		int data = queue[front];
		front++;
		size--;
		rear--; 
		return data;
		
	}
}
