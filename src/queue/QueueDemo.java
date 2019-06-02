package queue;

public class QueueDemo {

	public static void main(String[] args) {
		/*
		 * QueueArray<Integer> queue=new QueueArray<Integer>(5); queue.enQueue(10);
		 * queue.enQueue(20); queue.enQueue(30); queue.enQueue(40); queue.enQueue(50);
		 * queue.enQueue(60); System.out.println("Dequeue: "+queue.deQueue());
		 * System.out.println("Dequeue: "+queue.deQueue());
		 * System.out.println("Dequeue: "+queue.deQueue());
		 * System.out.println("Dequeue: "+queue.deQueue());
		 * System.out.println("Dequeue: "+queue.deQueue());
		 * System.out.println("Dequeue: "+queue.deQueue());
		 */
		/*
		 * QueueDArray<Integer> queue=new QueueDArray<Integer>(); queue.enQueue(10);
		 * queue.enQueue(70); queue.enQueue(30); queue.enQueue(40); queue.enQueue(50);
		 * queue.enQueue(60); System.out.println("Dequeue: "+queue.deQueue());
		 * System.out.println("Dequeue: "+queue.deQueue());
		 * System.out.println("Dequeue: "+queue.deQueue());
		 * System.out.println("Dequeue: "+queue.deQueue());
		 * System.out.println("Dequeue: "+queue.deQueue());
		 * System.out.println("Dequeue: "+queue.deQueue());
		 * System.out.println("Dequeue: "+queue.deQueue());
		 */
		QueueLinkedList<Integer> queue=new QueueLinkedList<Integer>();
		queue.enQueue(10);
		queue.enQueue(70);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		queue.enQueue(60);
		queue.enQueue(80);
		System.out.println("Dequeue: "+queue.deQueue());
		System.out.println("Dequeue: "+queue.deQueue());
		System.out.println("Dequeue: "+queue.deQueue());
		System.out.println("Dequeue: "+queue.deQueue());
		System.out.println("Dequeue: "+queue.deQueue());
		System.out.println("Dequeue: "+queue.deQueue());
		System.out.println("Dequeue: "+queue.deQueue());
	}
}
