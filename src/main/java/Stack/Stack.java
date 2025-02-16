package Stack;

public class Stack {

	private int top;
	private int size;
	private int[] stackArray;
	
	public Stack(int s) {
		size=s;
		stackArray= new int[s];
		top=-1;
	}
	
	public void push(int item) {
		if(top==size-1) {
			System.out.println("Stack is full");
		}
		else {
			top++;
			stackArray[top]=item;
		}
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Element popped: "+stackArray[top]);
			top--;
		}
	}
	
	public int peek(){
		return stackArray[top];
	}
}
