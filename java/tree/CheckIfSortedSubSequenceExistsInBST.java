package tree;

/**
 * Check if given sorted sub-sequence exists in binary search tree
   Given a binary search tree and a sorted sub-sequence. the task is to check if the given sorted sub-sequence exist in binary search tree or not.

 * @author saikatkar1
 *
 */
public class CheckIfSortedSubSequenceExistsInBST {

	public int index = 0;
	public static void main(String[] args) {
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
		CheckIfSortedSubSequenceExistsInBST checkIfSortedSubSequenceExistsInBST = new CheckIfSortedSubSequenceExistsInBST();
		int [] arr = {0,1,2,3};
		System.out.println(checkIfSortedSubSequenceExistsInBST.check(arr, searchTree.root));
	}
	
	public boolean check(int arr[],Node root) {
		checkUtil(arr, root);
		System.out.println(index);
		if(index == arr.length ) {
			return true;
		}else {
			return false;
		}
	}
	
	public void checkUtil(int[] arr,Node root) {
		if(root!=null) {
			checkUtil(arr, root.left);
			if(index<arr.length && arr[index] == root.key) {
				index++;
			}
			checkUtil(arr,root.right);
		}
	}

}
