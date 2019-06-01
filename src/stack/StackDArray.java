package stack;

import java.util.Arrays;

public class StackDArray<T> {
	Object[] array;
	int size;
	int top;
	public StackDArray() {
		super();
		this.size = 1;
		array=new Object[size];
		top=-1;
	}
	public void push(Object newElement) {
			ensureCapacity(top+2);
			top++;
			array[top]=newElement;
		
	}
	public void ensureCapacity(int minCapacity) {
		int oldCapacity=getSize();
		if(minCapacity>oldCapacity) {
			int newCapacity=oldCapacity*2;
			if(newCapacity<minCapacity)
				newCapacity=minCapacity;
			array=Arrays.copyOf(array, newCapacity);
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
	public int getSize() {
		return array.length;
	}
}
