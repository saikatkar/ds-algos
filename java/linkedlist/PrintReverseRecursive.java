package linkedlist;

/**
 * Print reverse of a Linked List without actually reversing
	Given a linked list, print reverse of it using a recursive function. 
	For example, if the given linked list is 1->2->3->4, then output should be 4->3->2->1.
 * @author saikatkar1
 *
 */
public class PrintReverseRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyLinkedList<Integer> myList = new MyLinkedList<>();
		
		myList.addFirst(6);
		myList.addFirst(7);
		myList.addFirst(8);
		myList.addFirst(9);
		myList.addFirst(10);
		myList.addFirst(11);
		
		myList.printList();
		System.out.println();
		printReverse(myList.getHeadNode());

	}

	public static void printReverse(MyLinkedList.Node temp) {
		
		if(temp == null) {
			
			return;
		}
		printReverse(temp.next);
		System.out.print(temp.item+" ");
	}
}
