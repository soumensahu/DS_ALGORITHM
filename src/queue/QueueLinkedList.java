package queue;

import linkedlist.NodeDouble;

public class QueueLinkedList<T> {
	NodeDouble rear;
	NodeDouble front;
	public QueueLinkedList() {
		rear=null;
		front=null;
	}
	public void enQueue(Object value) {
		NodeDouble newNode=new NodeDouble(value, null, null);
		if(rear==null) {
			rear=newNode;
			front=newNode;
		}else {
			newNode.next=null;
			newNode.previous=rear;
			rear.next=newNode;
			rear=newNode; 
		}
	}
	public T deQueue() {
		if(rear==null || front== null) {
			System.out.println("Queue is empty");
			return null;
		}else {
			T value=(T)front.value;
			front=front.next;
			if(front!=null)
				front.previous=null;
			return value;
		}
	}

}
