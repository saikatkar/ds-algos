package tree;

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
		
		System.out.println();
		System.out.print("The size of the tree is ");
		
		System.out.println(searchTree.size(searchTree.root));
		
		System.out.println(searchTree.search(1));
		System.out.println(searchTree.search(-333));
		System.out.println("Search iteratively");
		System.out.println(searchTree.searchIterative(1));
		System.out.println(searchTree.searchIterative(-333));
		
		//searchTree.delete(33);
		
		searchTree.inorder();
		System.out.println("Inorder stack..");
		System.out.println();
		BinarySearchTree.inorderStack(searchTree.root);
		System.out.println();
		System.out.println("Preorder stack..");
		System.out.println();
		BinarySearchTree.preorderStack(searchTree.root);
		System.out.println();
		System.out.println("Postorder stack..");
		System.out.println();
		BinarySearchTree.postorderStack(searchTree.root);
		
		
	}
	
	
}
