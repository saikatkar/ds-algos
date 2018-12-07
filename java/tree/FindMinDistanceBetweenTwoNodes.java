package me.practice.tree;

public class FindMinDistanceBetweenTwoNodes {
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
		
		searchTree.inorder();
		
		System.out.println(findMinDistance(searchTree.root,2,12));

	}
	
	static public int findMinDistance(Node root,int k1 ,int k2) {
		Node lca = lca(root, k1, k2);
		int d1 = findDistance(lca, k1, 0);
		int d2 = findDistance(lca, k2, 0);
		
		return d1+d2;
		
	}
	
	static int findDistance(Node node,int k,int distance) {
		if(node == null) {
			return 0;
		}
		if(node.key == k) {
			return distance;
		}
		if(node.key > k) {
			return findDistance(node.left, k, distance+1);
		}else {
			return findDistance(node.right, k, distance+1);
		}
		
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
