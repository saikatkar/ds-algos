package linkedlist;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		
		myList.addFirst(6);
		myList.addFirst(7);
		myList.addFirst(8);
		myList.addFirst(9);
		myList.addFirst(10);
		
		myList.addLast(1);
		myList.addLast(2);
		myList.addLast(3);
		myList.addLast(4);
		myList.addLast(5);
		
		
//		myList.add(9, 500);
//		
//		myList.removeFirst();
//		myList.removeLast();
//		
//		System.out.println(myList.getFirst());
//		System.out.println(myList.getLast());
//		System.out.println(myList.get(4));
//		
		
		myList.printList();
		System.out.println();
		myList.printReverseList();
		System.out.println();
		System.out.println(myList.size());
		myList.remove(1);
		myList.printList();
		

		
		

	}

}
