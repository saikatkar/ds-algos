package tree;

/**
 * Largest number in BST which is less than or equal to N
   We have a binary search tree and a number N. 
   Our task is to find the greatest number in the binary search tree that is less than or equal to N. 
   Print the value of the element if it exists otherwise print -1.
   Examples:For the above given binary search tree-

Input : N = 24
Output :result = 21
(searching for 24 will be like-5->12->21)

Input  : N = 4
Output : result = 3
(searching for 4 will be like-5->2->3)
 * @author saikatkar1
 *
 */
public class LargestNumberLessThanN {

	public static void main(String[] args) {
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
		System.out.println(" ");
		
		LargestNumberLessThanN largestNumberLessThanN = new LargestNumberLessThanN();
		int k =largestNumberLessThanN.largestNumberLessThanN(searchTree.root, -5);
		System.out.println(k);
	}
	
	public int largestNumberLessThanN(Node root,int N) {
		
		if(root == null) {
			return -1;
		}
		if(root.key == N) {
			return N;
		}
		
		if(root.key < N) {
			int k = largestNumberLessThanN(root.right, N);
			if(k == -1) {
				return root.key;
			}else {
				return k;
			}
		}else {
			return largestNumberLessThanN(root.left, N);
		}
		
		
	}

}
