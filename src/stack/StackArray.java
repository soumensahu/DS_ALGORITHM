package stack;

public class StackArray<T> {
	Object[] array;
	int size;
	int top;
	public StackArray(int size) {
		super();
		this.size = size;
		array=new Object[size];
		top=-1;
	}
	public void push(Object newElement) {
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}else {
			top++;
			array[top]=newElement;
		}
	}
	public boolean isFull() {
		return ((size-1)==top);
	}
	public T pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return null;
		}
		T item=(T)array[top];
		top--;
		return item;
	}
	public boolean isEmpty() {
		return (top==-1);
	}
}
