package DoublyLinkedList;

public class DoublyLinkedList {

	
	public void forwardTraversal(Node head) {
		Node curr = head;

		while (curr != null) {
			System.out.print(curr.data + " ");

			curr = curr.next;
		}

		System.out.println();
	}
	
	public void BackwardTraversal(Node head) {
		Node currNode= head;
		
		while(currNode!=null) {
			System.out.print(currNode.data+" ");
			currNode=currNode.prev;
		}
		
		System.out.println();
	}
	
	public Node insertBegin(Node head,int data) {
		
		Node currNode=new Node(data);
		currNode.next=head;
		if(head!=null) {
			head.prev=currNode;
			
		}
		
		return currNode;
	}
	
	public Node insertLast(Node head,int data) {
		
		Node addNode=new Node(data);
		Node currNode=head;
		
		if(head!=null) {
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=addNode;
		}
		
		return head;
	}
	
	public Node insertBeforeOrAfterKey(Node head, int data, int key,String placement) {
		
		Node addNode=new Node (data);
		Node currNode=head;
		Node prev=null;
		boolean after=placement.equals("next")?true:false;
		if(currNode!=null&&currNode.data==key) {
			if(after&&currNode.next!=null) {
			//addNode.prev=currNode;
				prev=currNode;
				addNode.next=currNode.next;
				prev.next=addNode;
				
			}
			else if(after&&currNode.next==null) {
				currNode.next=addNode;
			}
			else {
				currNode.prev=addNode;
				addNode.next=currNode;
			}
		}
		else {
			while(currNode!=null&&currNode.data!=key) {
				prev=currNode;
				currNode=currNode.next;
			}
			if(currNode!=null&&currNode.data==key) {
				if(after&&currNode.next!=null) {
					prev=currNode;
					addNode.next=currNode.next;
					prev.next=addNode;
					}
					else if(after&&currNode.next==null) {
						currNode.next=addNode;
					}
				else {
					prev.next=addNode;
					addNode.next=currNode;
				}
			}
		}
		
		return head;
	}
	
	
	
}
