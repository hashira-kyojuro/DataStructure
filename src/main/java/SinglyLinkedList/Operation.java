package SinglyLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Operation {

	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
		SinglyLinkedList list2=new SinglyLinkedList();
		list2.add(32);
		list2.add(35);
		list2.add(36);
		list.add(30);
		list.add(25);
		list.add(50);
		
		List<Integer> list3=new ArrayList<>();
		
		list3.addAll( getNodeValues(list));
		list3.addAll( getNodeValues(list2));
		Collections.sort(null);
		System.out.println(list3);
//		System.out.println();
//		list2.display();
		
		
	}
	
	public static List<Integer> getNodeValues(SinglyLinkedList list){
		List<Integer> list2=new ArrayList<>();
		if(list==null) {
			return null;
		}
		else {
			Node head=list.head;
			while(head!=null) {
				list2.add(head.data);
				head=head.next;
			}
		}
		
		
		return list2;
	}
}
