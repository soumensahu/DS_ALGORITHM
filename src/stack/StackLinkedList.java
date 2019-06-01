package stack;

import linkedlist.Node;

public class StackLinkedList<T> {

	Node top;

	public StackLinkedList() {
		top=null;
	}
	public void push(Object value) {
		Node newNode=new Node(value, null);
		if(top==null)
			top=newNode;
		else {
			newNode.next=top;
			top=newNode;
		}
	}
	public T pop() {
		if(top==null) {
			System.out.println("Stack is empty");
			return null;
		}else {
			T popItem=(T)top.value;
			top=top.next;
			return popItem;
		}
	}
	public void display() {
		Node n=top;
		while(n!=null) {
			System.out.println(n.value);
			n=n.next;
		}
	}
}
