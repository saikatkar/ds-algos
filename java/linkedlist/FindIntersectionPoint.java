package com.my.linkedlist;

/**
 * 
 * Write a function to get the intersection point of two Linked Lists.
   There are two singly linked lists in a system. By some programming error the end node
   of one of the linked list got linked into the second list, forming a inverted Y shaped list.
   Write a program to get the point where two linked list merge.

 * @author saikatkar1
 *
 */
public class FindIntersectionPoint {
	
	
	public static void main(String [] args) {
		
		MyLinkedList<Integer> myList1 = new MyLinkedList<>();
		
		myList1.addFirst(9);
		myList1.addLast(10);
		myList1.addLast(11);
		myList1.addLast(12);
		
		
		MyLinkedList<Integer> myList2 = new MyLinkedList<>();
		
		myList2.addFirst(6);
		myList2.addLast(7);
		myList2.addLast(8);
		myList2.addLast(1);
		myList2.addLast(2);
		myList2.addLast(3);
		myList2.addLast(4);
		myList2.addLast(10);
		myList2.addLast(11);
		myList2.addLast(12);
		
		findIntersectionPoint(myList1, myList2);
		
		
	}
	
	public static void findIntersectionPoint (MyLinkedList myList1,MyLinkedList myList2) {
		
		int c1 = myList1.size();
		int c2 = myList2.size();
		int d =0;
		if(c1>c2) {
			d = c1-c2;
			myList1.setHeadNode(myList1.getNode(d));
		}else {
			d = c2-c1;
			myList2.setHeadNode(myList2.getNode(d));
		}
		
		MyLinkedList.Node temp1 = myList1.getHeadNode();
		MyLinkedList.Node temp2 = myList2.getHeadNode();
		
		while(temp1!=null && temp2!=null) {
			
			if(temp1.item.equals(temp2.item)) {
				
				System.out.println("Intersection found");
				System.out.println(temp1.item);
				return;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		
		
	}

}
