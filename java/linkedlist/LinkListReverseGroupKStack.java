package com.my.linkedlist;

import java.util.Stack;

/**
 * Reverse a Linked List in groups of given size | Set 2
	Given a linked list, write a function to reverse every k nodes (where k is an input to the function).
	
	Examples:
	
	Inputs:  1->2->3->4->5->6->7->8->NULL and k = 3 
	Output:  3->2->1->6->5->4->8->7->NULL. 
	
	Inputs:   1->2->3->4->5->6->7->8->NULL and k = 5
	Output:  5->4->3->2->1->8->7->6->NULL.
 * @author saikatkar1
 *
 */
public class LinkListReverseGroupKStack {

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
		myList.addLast(8);
		
		myList.printList();
		int k =1;
		myList.setHeadNode(reverseList( myList,k));
		myList.printList();

	}

	public static <E> MyLinkedList.Node<E> reverseList(MyLinkedList<E> myList,int k){
		
		MyLinkedList.Node<E> curr = myList.getHeadNode();
		MyLinkedList.Node<E> head = myList.getHeadNode();
		MyLinkedList.Node<E> prev = null;
		Stack<MyLinkedList.Node<E>> stack = new Stack<>();
		int count =0;
		while(curr!=null) {
			while(curr!= null && count<k) {
				stack.push(curr);
				curr = curr.next;
				count ++;
			}
			count =0;
		
		
			while(stack.size()>0) {
				
				MyLinkedList.Node<E> item = stack.pop();
				//First node of the linked list
				if(prev == null) {
					prev = item;
					head = prev;
				}else {
					prev.next = item;
					prev = prev.next;
				}
			}
			
		}
		prev.next = null;
		return head;
		
	}
}
