package me.practice.tree;

/**
 * @author saikatkar1
 *
 */
public class TreeTest {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		BinarySearchTree searchTree = new BinarySearchTree();
		searchTree.insert(1);
		searchTree.insert(3);
		searchTree.insert(2);
		searchTree.insert(0);
		searchTree.insert(33);
		searchTree.insert(12);
		searchTree.insert(-1);
		searchTree.insert(-2);
		
		searchTree.inorder();
		
		System.out.println(searchTree.search(1));
		System.out.println(searchTree.search(-333));
		
		searchTree.delete(33);
		
		searchTree.inorder();
	}
	
	
}
