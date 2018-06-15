package com.my.linkedlist;

import com.my.linkedlist.MyLinkedList.Node;

/**
 * Find the middle of a given linked list in C and Java
   Given a singly linked list, find middle of the linked list.
   For example, if given linked list is 1->2->3->4->5 then output should be 3.

   If there are even nodes, then there would be two middle nodes,
   we need to print second middle element.
   For example, if given linked list is 1->2->3->4->5->6 then output should be 4.
 * @author saikatkar
 *
 */
public class FindTheMiddleNode {

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
		findMiddleNode(myList.getHeadNode());

	}
	
	
	
	/**
	 * Find the middle node of a linked list by moving one pointer by one and the other by two
	 * When the second reaches the end ,the first reaches the middle.
	 * @param myList
	 */
	public static <E> Node<E> findMiddleNode(MyLinkedList.Node<E> head) 
	{
		//MyLinkedList.Node head = myList.getHeadNode();
		MyLinkedList.Node temp1 = head.next;
		MyLinkedList.Node temp2 = head;
		
		while(temp1!=null) {
			temp1 = temp1.next;
			if(temp1!=null) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			
		}
		
		System.out.println(temp2.item);
		return temp2;
		
	}

}
