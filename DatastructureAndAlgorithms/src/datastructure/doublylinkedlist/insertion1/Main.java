package datastructure.doublylinkedlist.insertion1;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		
		list.push(4);
		list.printList();
		
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.printList();
		
		list.push(8);
		list.printList();
		
		list.insertAfter(list.head.next.next ,9 );
		list.printList();
		
		list.insertBefore(list.head, 10);
		list.printList();
		
		
	}

}
