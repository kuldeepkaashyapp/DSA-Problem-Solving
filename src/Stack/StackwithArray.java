package Stack;

public class StackwithArray {

	private int size;
	private int top;
	int stack[];

	public StackwithArray(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;

	}

	public void push(int data) {
		if (top == size - 1) {
			System.out.println("Stack Over Flow ");
			return;
		}

		stack[++top] = data;

		System.out.println(data + " value pushed in the Stack index: " + top);

	}

	public boolean pop() {

		if (top == -1) {
			System.out.println("this element Has been Deleted ");
			return false;
		}

		int dataStroe = stack[top];

		int data = stack[top--];

		System.out.println(data + "element has been redused");

		return true;

	}
	
	public void peek() {
		
		if(top ==-1) {
			
			System.out.println("Stack is empty ");
			
			return;
		}
		
		System.out.println("peek of the Stack "+stack[top]);
	}
	
	
	public void size() {
		
		if(top== -1) {
			 System.out.println("stack is empty");
			return;
			
		}else {
			
			
			System.out.println("Size of the stack is "+(top+1));
			
		}
		
		
		
		
	}

}
