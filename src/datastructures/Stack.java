package datastructures;

public class Stack {
	
	public static void main(String[] args) {
		StackImpl st = new StackImpl(5);
		st.push(4);
		st.push(2);
		st.push(2);
		st.push(2);
		st.push(2);
		//st.push(2);
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		//st.pop();
		
	}

}

class StackImpl{
	
	private int[] stack;
	private int top;
	private int capacity;
	
	StackImpl(int capacity){
		this.capacity = capacity; 
		this.stack = new int[capacity];
		this.top = -1;
	}
	
	public void push(int a) {
		if(top + 1 == capacity) {
			throw new RuntimeException("StackOverFlowException");
		}else {
			stack[++top] = a;
		}
	}
	
	public int pop() {
		int a = 0;
		if(top < 0) {
			throw new RuntimeException("StackEmptyException");
		}else {
			a = stack[top--];
		}
		return a;
	}
}


