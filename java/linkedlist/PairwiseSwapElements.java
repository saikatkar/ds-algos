package com.my.linkedlist;

/**
 * Pairwise swap elements of a given linked list by changing links
Given a singly linked list, write a function to swap elements pairwise. For example, 
if the linked list is 1->2->3->4->5->6->7 then the function should change it to 2->1->4->3->6->5->7, 
and if the linked list is 1->2->3->4->5->6 then the function should change it to 2->1->4->3->6->5
 * @author saikatkar1
 *
 */
public class PairwiseSwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		
		myList.addFirst(1);
		myList.addLast(2);
		myList.addLast(3);
		myList.addLast(4);
		myList.addLast(5);
		myList.addLast(6);
		myList.addLast(7);
		
		myList.printList();
		
		pairwiseSwap(myList.getHeadNode(), myList);
		System.out.println();
		
		myList.printList();

	}
	
	
	public static <E> void pairwiseSwap(MyLinkedList.Node<E> prev,MyLinkedList<E> myLinkedList) {
		
		MyLinkedList.Node<E> curr = prev.next;
		myLinkedList.setHeadNode(curr);
		
		
		while(true) {
			
			MyLinkedList.Node<E> next = curr.next;
			
			curr.next = prev;
			if(next == null || next.next == null) {
				prev.next = next;
				break;
			}
			prev.next = next.next;

			prev = next;
			curr = next.next;
		}
		
		return;
	}

}
