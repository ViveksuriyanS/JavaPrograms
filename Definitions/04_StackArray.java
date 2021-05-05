import java.util.Arrays;

public class MainStack {
	public static void main(String... strings) {
		System.out.println("Creating a stack");
		Stack stackI = new Stack(5);
		
	}
}

class Stack {
	int size;
	int[] stack;
	int top;
	
	Stack(int size) {
		this.size = size;
		this.stack = new int[size];
		top = -1;
	}
	
	public void printStack() {
		System.out.println(Arrays.toString(Arrays.copyOfRange(stack, 0, top)));
	}
	
	public void addElement(int newData) {
		if(!isFull()) {
			stack[++top] = newData;
		}	
	}
	
	public Boolean isFull() {
		if(top > size) {
			System.out.println("Stack is full");
			return true;
		}
		return false;
	}
	
	public void removeElement(int newData) {
		if(!isEmpty()) {
			top--;
		}
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return true;
		}
		return false;
	}
	
	public void peek() {
		if(!isEmpty()) {
			System.out.println("Top element is " + stack[top]);
		}
	}
	
	
}