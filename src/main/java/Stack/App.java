package Stack;

public class App {
public static void main(String[] args) {
	Stack stack=new Stack(3);
	stack.push(10);
	System.out.println("Element Pushed: "+stack.peek());
	stack.push(20);
	System.out.println("Element Pushed: "+stack.peek());
	stack.push(30);
	System.out.println("Element Pushed: "+stack.peek());
	stack.pop();
	System.out.println(stack.peek());

	}
}
