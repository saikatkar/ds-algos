package linkedlist;

import linkedlist.MyLinkedList.Node;

/**
 * Rotate a Linked List
	Given a singly linked list, rotate the linked list counter-clockwise by k nodes. 
	Where k is a given positive integer. For example, 
	if the given linked list is 10->20->30->40->50->60 and k is 4, the list should be modified to 50->60->10->20->30->40. 
	Assume that k is smaller than the count of nodes in linked list.


 * @author saikatkar1
 *
 */
public class RotateLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		myList.addFirst(10);
		myList.addLast(20);
		myList.addLast(30);
		myList.addLast(40);
		myList.addLast(50);
		myList.addLast(60);
		int k =2;
		myList.printList();
		
		rotateLinkedList(myList, k);
		
		myList.printList();


	}

	public static <E> void rotateLinkedList(MyLinkedList<E> myList,int k) {
		
		Node<E> temp = myList.getNode(k-1);
		Node<E> temp1 = temp.next;
		temp.next = null;
		temp = temp1;
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		temp.next = myList.getHeadNode();
		
		myList.setHeadNode(temp1);
		
	}
}
