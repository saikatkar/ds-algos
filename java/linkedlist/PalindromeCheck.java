package linkedlist;

/**
 * Function to check if a singly linked list is palindrome
   Given a singly linked list of characters, write a function that returns true if the given 
   list is palindrome, else false.
 * @author saikatkar1
 *
 */
public class PalindromeCheck {

	static MyLinkedList<Integer> myList = new MyLinkedList<>();
	static MyLinkedList.Node left;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		myList.addFirst(1);
		myList.addFirst(2);
		myList.addFirst(3);
		myList.addFirst(2);
		myList.addFirst(1);
		//myList.addFirst(11);	
		myList.printList();
		System.out.println(checkIfPalindrome( myList.getHeadNode()));

	}

	public static boolean checkIfPalindrome(MyLinkedList.Node right) {
		
		left = myList.getHeadNode();
		if(right == null) {
			return true;
		}
		
		//check if the sublist is palindrome or not
		boolean isPalindrome = checkIfPalindrome( right.next);
		if(!isPalindrome) {
			return false;
		}
		boolean isp1 = left.item.equals(right.item) ;
		
		left = left.next;
		return isp1;
		
	}
}
