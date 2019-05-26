package linkedlist;

/**
 * Write a function detectAndRemoveLoop() that checks whether a given Linked List contains loop and if loop is present then removes the loop and returns true.
 *  And if the list doesn’t contain loop then returns false. Below diagram shows a linked list with a loop. 
 * detectAndRemoveLoop() must change the below list to 1->2->3->4->5->NULL.
 * @author saikatkar1
 *
 */
public class DetectAndDeleteCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		myList.addFirst(12);
		myList.addLast(15);
		myList.addLast(10);
		myList.addLast(11);
		myList.addLast(5);
		myList.addLast(6);
		//myList.getTailNode().next = myList.getHeadNode().next.next;
		
		detectAndDeleteCycle(myList);

	}

	public static <E> void detectAndDeleteCycle(MyLinkedList<E> myList) {
		
		MyLinkedList.Node<E> slow = myList.getHeadNode();
		MyLinkedList.Node<E> fast = myList.getHeadNode();
		boolean cycleFound = Boolean.FALSE;
		while(fast!=null && slow!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				System.out.println("Cycle Found");
				cycleFound = true;
				break;
			}
		}
		if(cycleFound) {
			slow = myList.getHeadNode();
			while(slow.next != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}
			
			fast.next = null;
			myList.printList();
		}else {
			System.out.println("Cycle Not Found");
		}
	}
}
