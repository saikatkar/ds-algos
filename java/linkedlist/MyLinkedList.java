package com.my.linkedlist;

import java.util.NoSuchElementException;

/**
 * Holds all the basic functionalities of LinkedList
 * @author saikatkar
 *
 */
public class MyLinkedList<E> {
	
	private Node<E> first;
	
	private Node<E> last;
	
	private int size;
	
	/**
	 * @author saikatkar
	 *
	 * @param <E>
	 */
	public static class Node<E>{
		
		E item;
		Node<E> prev;
		Node<E> next;
		
		
		
		Node(Node<E> prev,E element, Node<E> next){
			
			this.prev = prev;
			this.item = element;
			this.next = next;
				
		}
	}
		
		/**
		 * Adds an element to the beginning of the list
		 * @param element
		 */
		public void addFirst(E element) {
			
			Node<E> f = first;
			Node<E> newNode= new Node<>(null, element, f);
			first = newNode;
			if(f == null) {
				
				last = newNode;
			}else {
				
				f.prev = newNode;
			}
			
			size++;
			
		}
		
		
		/**
		 * Adds an element to the end of the list.
		 * @param element
		 */
		public void addLast(E element) {
			
			Node<E> l = last;
			Node<E> newNode = new Node<>(l,element,null);
			last = newNode;
			if(l == null) {
				first = newNode;
			}else {
				l.next = newNode;
			}
			
			size ++;
		}
		
		
		 
		
		/**
		 * Returns a node at particular index in the list.
		 * @param index
		 * @return Node<E>
		 */
		 public Node<E> getNode(int index){
			
			Node<E> temp;
			if (index < size>>2) {
				temp = first;
				for(int i =0;i<index;i++) {
					
					temp = temp.next;
				}
				
				return temp;
			}else {
				temp = last;
				for(int i =size-1; i>index ;i--) {
					
					temp = temp.prev;
				}
				
				return temp;
			}
			
		}
		
		 /** 
		  * Inserts the specified element at the specified position in this list.
		  * Shifts the element currently at that position (if any) and any
		  * subsequent elements to the right (adds one to their indices).
		 * @param index
		 * @param element
		 */
		public void add(int index,E element) {
			 
			 Node<E> node = getNode(index);
			 Node<E> prev = node.prev;			 
			 //Node<E> next = node.next;
			 Node<E> newNode = new Node<>(prev, element, node);
			 if(node.prev!=null) {
				 node.prev.next = newNode;
				 node.prev = newNode;
			 }else {
				 first = newNode;
			 }
			size++;
		 }
		 
		 
		 /**
		 * Removes the element at the specified position in this list.  Shifts any
		 * subsequent elements to the left (subtracts one from their indices).
		 * Returns the element that was removed from the list.
		 * @param index
		 * @return the element residing at that index.
		 */
		public E remove(int index) {
			 
			 Node<E> node = getNode(index);
			 if(node.prev!=null) {
				 node.prev.next = node.next;
			 }else {
				 first = node.next;
			 }
			 if(node.next!=null) {
				 node.next.prev = node.prev;
			 }else {
				 last = node.prev;
			 }
			 size --;
			 return node.item;
		 }
		
		
		
		/**
		 * Removes the first element of the list.
		 * @return the element to be removed
		 */
		public E removeFirst() {
			Node<E> temp = first;
		    final E element = temp.item;
			first = temp.next;
			if(temp.next == null) {
				last = null;
			}else {
				first.prev = null;
			}
			
			temp.next = null;
			temp.item = null;
			size --;
			return element;
					
		}
		
		/**
		 * Removes the last element of the list
		 * @return the last element of the list which is to be removed
		 */
		public E removeLast() {
			
			Node<E> temp = last;
			final E element = temp.item;
			last = temp.prev;
			if(temp.prev == null) {
				first = null;
			}else {
				last.next = null;
			}
			temp.prev = null;
			temp.item = null;
			size--;
			return element;
		}
		
		/**
		 *  Prints the linked list
		 */
		public void printList() {
			System.out.print("[ ");
			Node<E> temp = first;
			while(temp!=null) {
				System.out.print(temp.item +" ");
				temp = temp.next;
			}
			System.out.print("]");
		}
		
		
		/**
		 * Returns the first element of the list
		 * @return first element of the list
		 */
		public E getFirst() {
			
			Node<E> f = first;
			if(f == null) {
				throw new NoSuchElementException();
			}
			return f.item;
		}
		
		/**
		 * Returns the first element of the list
		 * @return first element of the list
		 */
		public E getLast() {
			
			Node<E> f = last;
			if(f == null) {
				throw new NoSuchElementException();
			}
			return f.item;
		}
		
		/**
		 * Returns the element at the specified index of the list
		 * @param index
		 * @return the element at the specified index.
		 */
		public E get(int index) {
			
			Node<E> f = getNode(index);
			if(f == null) {
				throw new NoSuchElementException();
			}
			return f.item;
		}
		
		/**
		 *  Prints the linked list in reverse order.
		 */
		public void printReverseList() {
			System.out.print("[ ");
			Node<E> temp = last;
			while(temp!=null) {
				System.out.print(temp.item +" ");
				temp = temp.prev;
			}
			System.out.print("]");
		}
		
		
		/**
		 * @return
		 */
		public int size() {
			
			return size;
		}
		
		/**
		 * @return
		 */
		public Node<E> getHeadNode(){
			
			return first;
		}
		
		public void setHeadNode(Node<E> head){
			
			this.first = head;
		}
		
		/**
		 * @return
		 */
		public Node<E> getTailNode(){
			
			return last;
		}


}
