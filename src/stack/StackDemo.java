package stack;

public class StackDemo {

	public static void main(String[] args) {
		//stack using array
		/*
		 * StackArray<Integer> stack=new StackArray<Integer>(5); stack.push(10);
		 * stack.push(20); stack.push(30); stack.push(40); stack.push(50);
		 * stack.push(60); while(!stack.isEmpty()) { System.out.println(stack.pop()); }
		 */
		
		/*
		 * StackDArray<Integer> stack=new StackDArray<Integer>(); stack.push(10);
		 * System.out.println("current size : "+stack.getSize()); stack.push(20);
		 * System.out.println("current size : "+stack.getSize()); stack.push(30);
		 * System.out.println("current size : "+stack.getSize()); stack.push(40);
		 * System.out.println("current size : "+stack.getSize()); stack.push(50);
		 * System.out.println("current size : "+stack.getSize()); stack.push(60);
		 * System.out.println("current size : "+stack.getSize());
		 * while(!stack.isEmpty()) { System.out.println(stack.pop()); }
		 */
		StackLinkedList<Integer> stack=new StackLinkedList<Integer>();
		stack.pop();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.display();
		System.out.println("popping");
		System.out.println(stack.pop());
		System.out.println("After pop");
		stack.display();
		
	}
}
