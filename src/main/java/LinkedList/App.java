package LinkedList;

public class App {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
		list=list.insert(list,1);
		list=list.insert(list,2);
		list=list.insert(list,3);
		list=list.insert(list,4);
		list=list.insert(list,5);
		list=list.insert(list,6);
		list.print(list);
		System.out.println("List After Last Deleted Node");
		list.deleteLast(list);
		list.print(list);
		System.out.println("List After Last Deleted Key Node");
		list.deleteByKey(list, 1);
		list.print(list);
	}
}
