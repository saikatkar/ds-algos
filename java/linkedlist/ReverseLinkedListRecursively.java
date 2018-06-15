package com.my.linkedlist;

/**
 *   Given pointer to the head node of a linked list, the task is to reverse the linked list. 
	 We need to reverse the list by changing links between nodes.
	
	Examples:
	
	Input : Head of following linked list  
	       1->2->3->4->NULL
	Output : Linked list should be changed to,
	       4->3->2->1->NULL
	
	Input : Head of following linked list  
	       1->2->3->4->5->NULL
	Output : Linked list should be changed to,
	       5->4->3->2->1->NULL
	
	Input : NULL
	Output : NULL
	
	Input  : 1->NULL
	Output : 1->NULL
 * @author saikatkar1
 *
 */
public class ReverseLinkedListRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		myList.addFirst(6);
		myList.addFirst(7);
		myList.addFirst(8);
		myList.addFirst(9);
		myList.addFirst(10);
		
		myList.printList();
		reverseList(myList.getHeadNode(), null,myList);
		myList.printList();

	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void reverseList(MyLinkedList.Node curr,MyLinkedList.Node prev,MyLinkedList myList) {
		
		if(curr == null) {
			myList.setHeadNode(prev);
			return;
		}
		MyLinkedList.Node next = curr.next;
		curr.next = prev;
		
		prev = curr;
		curr = next;
		reverseList(curr, prev, myList);
	}

}
