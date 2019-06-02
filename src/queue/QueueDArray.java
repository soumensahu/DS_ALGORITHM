package queue;

import java.util.Arrays;

public class QueueDArray<T> {
	Object[] array;
	int size;
	int rear;
	int front;
	public QueueDArray() {
		size=1;
		array=new Object[size];
		rear=-1;
		front=-1;
	}
	public boolean isEmpty() {
		return (front==-1 || front>rear);
	}
	public void enQueue(Object value) {
		ensureCapacity(rear+2);
		rear=rear+1;
		array[rear]=value;
		if(front==-1)
			front=0;
	}
	public T deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}else
		{
			T item=(T)array[front];
			front=front+1;
			return item;
		}
	}
	private void ensureCapacity(int mincapacity) {
		int oldcapacity=getSize();
		if(mincapacity>oldcapacity) {
			int newcapacity=oldcapacity*2;
			if(newcapacity<mincapacity)
				newcapacity=mincapacity;
			array=Arrays.copyOf(array, newcapacity);
		}
	}
	private int  getSize() {
		return array.length;
	}
	
}
