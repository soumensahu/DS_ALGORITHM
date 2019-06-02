package queue;

public class QueueArray<T> {

	Object[] array;
	int size;
	int rear;
	int front;
	public QueueArray(int size) {
		this.size=size;
		array=new Object[this.size];
		rear=-1;
		front=-1;
	}
	public boolean isFull() {
		return (rear==(size-1));
	}
	public boolean isEmpty() {
		return (front==-1 || front>rear);
	}
	public void enQueue(Object value) {
		if(isFull()) {
			System.out.println("queue is full");
			return;
		}
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
}
