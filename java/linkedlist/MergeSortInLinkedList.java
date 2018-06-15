package com.my.linkedlist;

import com.my.linkedlist.MyLinkedList.Node;

/**
 * @author saikatkar1
 *
 */
public class MergeSortInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		myList.addFirst(12);
		myList.addLast(15);
		myList.addLast(10);
		myList.addLast(11);
		myList.addLast(5);
		myList.addLast(6);
		myList.addLast(2);
		myList.addLast(3);
		
		myList.printList();
		
		Node<Integer> head = mergeSort(myList.getHeadNode());
		myList.setHeadNode(head);
		System.out.println();
		myList.printList();
	}
	
	public static <E> Node<E> mergeSort(Node<E> head){
		
		if(head ==null || head.next==null) {
			return head;
		}
		
		Node<E> middleNode = FindTheMiddleNode.findMiddleNode(head);
		Node<E> middleNextNode = middleNode.next;
		
		middleNode.next = null;
		
		Node<E> left = mergeSort(head);
		Node<E> right = mergeSort(middleNextNode);
		
		Node<E> sortedList = merge(left, right);
		
		return sortedList;
	}

	public static <E> Node<E> merge(Node<E> a,Node<E> b){
		
		Node<E> result = null;
		if(a == null) {
			return b;
		}
		if(b == null) {
			return a;
		}
		
		if((Integer)a.item <= (Integer)b.item) {
			
			result = a;
			result.next = merge(a.next, b);
		}else {
			
			result = b;
			result.next = merge(a, b.next);
		}
		
		return result;
	}
}
