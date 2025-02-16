package SinglyLinkedList;


public class SinglyLinkedList {
 Node head;
 
 public void add(int data) {
	 Node newNode=new Node(data);
	 
	 if(head==null) {
		 head=newNode;
	 }
	 else {
		 Node current=head;
		 while(current.next!=null) {
			current=current.next;
		 }
		 current.next=newNode;
	 }
 }
 
 public void display() {
	 
	 if(head==null) {
		 System.out.println("List is empty");
		 return;
	 }
	 else {
		 Node current=head;
		 while(current!=null) {
			 System.out.print(current.data+"->");
			 current=current.next;
		 }
		 System.out.print("null");
	 }
	 
 }
 

 
 
 
}
