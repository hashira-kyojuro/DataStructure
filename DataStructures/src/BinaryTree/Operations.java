package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Operations {
	
	public static void main(String[] args) {
		
		 Node root = new Node(2);
	     root.left = new Node(3);
	     root.right = new Node(4);
	     root.left.left = new Node(5);
	     
	     
	     BFS(root);
		
	}
	
	
	static void BFS(Node root) {
		
		if(root==null) return;
		
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node node=queue.poll();
			System.out.println(node.value);
			if(node.left!=null) queue.add(node.left);
			if(node.right!=null)queue.add(node.right);
			
		}
		
		
		
		
	}
	
}
