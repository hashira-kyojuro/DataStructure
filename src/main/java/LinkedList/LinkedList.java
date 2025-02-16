package LinkedList;

public class LinkedList {

	Node head;
	
	public LinkedList insert(LinkedList list,int data) {
		
		Node newNode=new Node(data);
		
		if(list.head==null) {
			list.head=newNode;
		}
		else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
		
		return list;
	}
	
	public void print(LinkedList list) {
		
		Node currNode=list.head;
		
		while(currNode!=null) {
			System.out.println(currNode.data);
			currNode=currNode.next;
		}
		
		
	}
	
	public LinkedList deleteLast(LinkedList list) {
		
		
		Node currNode=list.head;
		Node prev=null;
		if(list.head!=null) {
		while(currNode.next!=null) {
			prev=currNode;
			currNode=currNode.next;
		}
		prev.next=currNode.next;
		}
		else {
			System.out.println("Linked-List is Empty");
		}
		return list;
	}
	
	public LinkedList deleteByKey(LinkedList list,int key) {
		
		Node currNode=list.head;
		Node prev=null;
		
		if(currNode!=null&&currNode.data==key) {
			list.head=currNode.next;
			return list;
		}
		while(currNode!=null&&currNode.data!=key) {
			prev=currNode;
			currNode=currNode.next;
		}
		
		
		if(currNode!=null&&currNode.data==key) {
			prev.next=currNode.next;
		}
		
		if(currNode==null) {
			System.out.println(key+" Not Found");
		}

		return list;
	}
	
	
}
