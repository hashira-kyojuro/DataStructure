package Queue;

public class Queue {
	private int maxSize;
	private int[] queueArray;
	private int front;
	private int rear;
	private int numOfItems;
	
	public Queue(int s) {
		maxSize=s;
		queueArray=new int[s];
		front=0;
		rear=-1;
		numOfItems=0;
	}
	
	public int peekFront() {
		return queueArray[front];
	}
	
	public int peekRear() {
		return queueArray[rear];
	}
	
	public boolean checkFull() {
		return numOfItems==maxSize;
	}
	
	public boolean checkEmpty(){
		return numOfItems==0;
	}
	
	public void enqueue(int item) {
		if(checkFull()) {
			System.out.println("Queue is Full");
		}
		else {
			rear++;
			queueArray[rear]=item;
			numOfItems++;
		}
	}
	
	public void dequeue() {
		if(checkEmpty()) {
			System.out.println("Empty");
		}
		else {
			System.out.println("Queue dequeued: "+queueArray[front]);
			front++;
			numOfItems--;
		}
	}
	
}
