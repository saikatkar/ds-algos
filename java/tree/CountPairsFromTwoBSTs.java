package me.practice.tree;

import java.util.Stack;

/**
 * Count pairs from two BSTs whose sum is equal to a given value x
	Given two BSTs containing n1 and n2 distinct nodes respectively. Given a value x. 
	The problem is to count all pairs from both the BSTs whose sum is equal to x.
 * @author saikatkar1
 *
 */
public class CountPairsFromTwoBSTs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// formation of BST 1 
        Node root1 = new Node(5);       /*             5        */
        root1.left = new Node(3); /*           /   \      */
        root1.right = new Node(7); /*         3     7     */
        root1.left.left = new Node(2); /*    / \   / \    */
        root1.left.right = new Node(4); /*  2   4 6   8    */
        root1.right.left = new Node(6); 
        root1.right.right = new Node(8); 
       
        // formation of BST 2 
        Node root2 = new Node(10);        /*           10         */
        root2.left = new Node(6); /*           /   \        */
        root2.right = new Node(15); /*        6     15      */
        root2.left.left = new Node(3); /*    / \   /  \     */
        root2.left.right = new Node(8); /*  3  8  11  18    */
        root2.right.left = new Node(11); 
        root2.right.right = new Node(18); 
       
        int x = 16; 
        System.out.println("Pairs = "
             + countPairs(root1, root2, x)); 
    } 

	
	
	public static int countPairs(Node root1,Node root2,int X) {
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		Node peek1,peek2;
		
		int count =0;
		while(true) {
			while(root1!=null) {
				stack1.push(root1);
				root1 = root1.left;
			}
			while(root2!=null) {
				stack2.push(root2);
				root2 = root2.right;
			}
			
			if(stack1.isEmpty() || stack2.isEmpty()) {
				break;
			}
			peek1 = stack1.peek();
			peek2 = stack2.peek();
			
			if(peek1.key + peek2.key == X) {
				count++;
				stack1.pop();
				stack2.pop();
				
				root1 = peek1.right;
				root2 = peek2.left;
				
			}
			if(peek1.key+peek2.key < X) {
				stack1.pop();
				root1 = peek1.right;	
			}
			if(peek1.key+peek2.key > X) {
				stack2.pop();
				root2 = peek2.left;	
			}
		}
		return count;
	}
}
