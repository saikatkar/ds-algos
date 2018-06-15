package com.my.linkedlist;

/**
 * Delete nodes which have a greater value on right side
	Given a singly linked list, remove all the nodes which have a greater value on right side.
	
	Examples:
	a) The list 12->15->10->11->5->6->2->3->NULL should be changed to 15->11->6->3->NULL. 
	Note that 12, 10, 5 and 2 have been deleted because there is a greater value on the right side.
	
	When we examine 12, we see that after 12 there is one node with value greater than 12 (i.e. 15), so we delete 12.
	When we examine 15, we find no node after 15 that has value greater than 15 so we keep this node.
	When we go like this, we get 15->6->3
	
	b) The list 10->20->30->40->50->60->NULL should be changed to 60->NULL. 
	Note that 10, 20, 30, 40 and 50 have been deleted because they all have a greater value on the right side.
	
	c) The list 60->50->40->30->20->10->NULL should not be changed.
 * @author saikatkar1
 *
 */
public class DeleteNodesGreaterValueRightSide {

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
		ReverseLinkedListIteratively.reverseList(myList);
		myList.printList();
		deleteNodes(myList);
		myList.printList();
		ReverseLinkedListIteratively.reverseList(myList);
		myList.printList();
		

	}
	
	public static <E> void deleteNodes(MyLinkedList<E> myList) {
		
		MyLinkedList.Node<E> maxNode = myList.getHeadNode();
		MyLinkedList.Node<E> temp = null;
		MyLinkedList.Node<E> curr = maxNode;
		
		while(curr!=null && curr.next!=null) { 
			
			if((Integer)curr.next.item < (Integer)maxNode.item) {
				temp = curr.next;
				curr.next = temp.next;
				temp = null;
				
			}else {
				curr=curr.next;
				maxNode = curr;
				
			}
			
			
		}
		
	}

}
