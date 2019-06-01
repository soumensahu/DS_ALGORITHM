package linkedlist;

public class LinkedListdemo {

	public static void main(String[] args) {
		LinearLinkedList<String> linkList=new LinearLinkedList<String>();
		linkList.add("soumen");
		linkList.add("sahu");
		linkList.add("Jonny");
		linkList.add("Sinha");
		//linkList.display();
		//linkList.delete();
		//System.out.println("Deleted\n");
		//linkList.display();
		
		DoubleLinkedList<String> doubleLinkedList=new DoubleLinkedList<String>();
		doubleLinkedList.add("soumen");
		doubleLinkedList.add("sahu");
		doubleLinkedList.add("Jonny");
		doubleLinkedList.add("Sinha");
		doubleLinkedList.display();
		doubleLinkedList.delete();
		System.out.println("Deleted\n");
		doubleLinkedList.display();
	}

}
