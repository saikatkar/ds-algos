package tree;



public class MorrisTraversal {

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
		System.out.println();
		traverseInorder(searchTree.root);

	}
	
	public static void traverseInorder(Node root) {
		Node current = root;
		if (root == null) {
			return;
		}
		while(current!=null) {
			if(current.left == null) {
				System.out.print(current.key+" ");
				current = current.right;
			}else {
				Node pre = current.left;
				while(pre.right!=null && pre.right!=current) {
					pre = pre.right;
				}
				
				if(pre.right == null) {
					pre.right = current;
					current = current.left;
				}
				if(pre.right == current) {
					 pre.right = null;
					 System.out.print(current.key+" ");
					 current = current.right;
				}
			}
		
			
		}
		
	}

}
