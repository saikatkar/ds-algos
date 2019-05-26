package tree;

/**
 * Lowest Common Ancestor in a Binary Search Tree.
	Given values of two values n1 and n2 in a Binary Search Tree, find the Lowest Common Ancestor (LCA). You may assume that both the values exist in the tree.
	BST_LCA
	LCA of 10 and 14 is 12
	LCA of 14 and 8 is 8
	LCA of 10 and 22 is 20
	Following is definition of LCA from Wikipedia:
	Let T be a rooted tree. The lowest common ancestor between two nodes n1 and n2 is defined as the lowest node in T that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).
	
	The LCA of n1 and n2 in T is the shared ancestor of n1 and n2 that is located farthest from the root. Computation of lowest common ancestors may be useful, for instance, as part of a procedure for determining the distance between pairs of nodes in a tree: the distance from n1 to n2 can be computed as the distance from the root to n1, plus the distance from the root to n2, minus twice the distance from the root to their lowest common ancestor. (Source Wiki)
	
	
 * @author saikatkar1
 *
 */
public class LowestCommonAncestor {
	static BinarySearchTree searchTree = new BinarySearchTree();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		searchTree.insert(1);
		searchTree.insert(3);
		searchTree.insert(2);
		searchTree.insert(0);
		searchTree.insert(33);
		searchTree.insert(12);
		searchTree.insert(-1);
		searchTree.insert(-2);
		
		Node lca = lca(searchTree.root, -2, 33);
		
		 System.out.println(lca != null ? lca.key:"One or more key is not present in the tree");

	}
	
	public static Node lca(Node root,int k1,int k2) {
		
		while(root!=null) {
			if(root.key > k1 && root.key > k2) {
				root = root.left;
			}else if(root.key < k1 && root.key < k2) {
				root = root.right;
			}else {
				if(searchTree.search(k1) && searchTree.search(k2)) {
					return root;
				}else {
					return null;
				}
				
			}
		}
		
		return root;
	}

}
