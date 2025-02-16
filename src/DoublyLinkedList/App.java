package DoublyLinkedList;

public class App {

	public static void main(String[] args) {
		Node head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		head.next=second;
		second.prev=head;
		second.next=third;
		third.prev=second;
		
		
		DoublyLinkedList operations=new DoublyLinkedList();
		
		System.out.println("Forward Traversal");
		operations.forwardTraversal(head);
		System.out.println("Backward Traversal");
		operations.BackwardTraversal(third);
		System.out.println("Adding at end");
		head=operations.insertBegin(head, 0);
		head=operations.insertLast(head, 5);
		operations.forwardTraversal(head);
		System.out.println("Adding next to key");
		head=operations.insertBeforeOrAfterKey(head, 3, 5, "before");
		head=operations.insertBeforeOrAfterKey(head, 10, 2, "next");
		operations.forwardTraversal(head);
	}
}
