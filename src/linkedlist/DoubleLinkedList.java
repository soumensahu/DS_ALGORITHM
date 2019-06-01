package linkedlist;

public class DoubleLinkedList<T> {
	NodeDouble head;

	public DoubleLinkedList() {
		head=null;
	}
	public void add(Object value) {
		NodeDouble newNode=new NodeDouble(value, null, null);
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head.previous=newNode;
			head=newNode;
		}
	}
	public void delete() {
		head=head.next;
		head.previous=null;
	}
	public void display() {
		NodeDouble n=head;
		while(n!=null) {
			System.out.println((T)n.value);
			n=n.next;
		}
	}
}
