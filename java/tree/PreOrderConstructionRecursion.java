package me.practice.tree;

/**
 * Given preorder traversal of a binary search tree, construct the BST((Recursion based solution).

	For example, if the given traversal is {10, 5, 1, 7, 40, 50}, then the output should be root of following tree.
	     10
	   /   \
	  5     40
	 /  \      \
	1    7      50
 * @author saikatkar1
 *
 */
public class PreOrderConstructionRecursion {
	
	private Integer index = new Integer(0);

	public static void main(String args[]) {
		
		 int pre[] = new int[]{10, 5, 1, 7, 40, 30, 50}; 
	     PreOrderConstructionRecursion construct = new PreOrderConstructionRecursion();
	     construct.construct(pre);
	}
	
	/**
	 * @param pre
	 */
	public  void construct(int[] pre) {
		Node root = constructUtil(pre, pre[0], Integer.MIN_VALUE, Integer.MAX_VALUE, pre.length);
		inorder(root);
	}
	
	/**
	 * @param pre
	 * @param key
	 * @param index
	 * @param min
	 * @param max
	 * @param size
	 * @return
	 */
	private Node constructUtil(int[] pre,int key,int min,int max,int size) {
		
		if(index.intValue() >= size) {
			return null;
		}
		Node root =null;
		if(key > min && key < max) {
			root = new Node(key);
			int preIndex = index.intValue();
			preIndex++;
			index = new Integer(preIndex);
			if(index.intValue() < size) {
				root.left = constructUtil(pre,pre[index.intValue()],min,key,size);
				root.right = constructUtil(pre,pre[index.intValue()],key,max,size);
			}
		}
		return root;
	}
	
	/**
	 * @param root
	 */
	public void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.key+" ");
			inorder(root.right);
		}
		
	}
}
