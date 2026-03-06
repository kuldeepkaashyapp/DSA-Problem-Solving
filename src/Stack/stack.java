package Stack;

import java.util.ArrayList;
import java.util.List;

public class stack {
	
	List<Integer> stack=new ArrayList<Integer>();
	
	int indexCounter=0;
	
	
	public void push(int data) {
	
		stack.addFirst(data);
		
		indexCounter++;
		
}
	public void peek() {
		
		System.out.println("peek of stack"+stack.getFirst());
	}
	
	public void pop(int data) {
		
	stack.remove(data);
	}
	
	public void size() {
		stack.size();
	}
}