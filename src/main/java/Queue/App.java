package Queue;

public class App {

	public static void main(String[] args) {
		Queue queue=new Queue(3);
		
		queue.enqueue(10);
		System.out.println("Added value: " + queue.peekRear());
		queue.enqueue(20);
		System.out.println("Added value: " + queue.peekRear());
		queue.enqueue(30);
		System.out.println("Added value: " + queue.peekRear());
		
		queue.dequeue();
		System.out.println("After Dequeue: " + queue.peekFront());
		
		
	}
}
