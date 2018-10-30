package me.practice.tree;

/**
 * @author saikatkar1
 *
 */
public class BinarySearchTree {
	
	Node root;
	
	/**
	 * @author saikatkar1
	 *
	 * @param <T>
	 */
	static class Node{
		
		Node right;
		Node left;
		int key;
		
		Node(int key){
			this.key = key;
		}

		
	}
	
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param key
	 */
	public  void insert(int key){
		this.root = insertRec(this.root, key);
	}
	
	private  Node insertRec(Node root,int key){
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(root.key > key) {
			
			root.left = insertRec(root.left,key);
		}else {
			
			root.right = insertRec(root.right,key);
		}
		return root;
		
	}
	public void inorder() {
		inorderRec(this.root);
	}
	private void inorderRec(Node root) {
		
		if(root!=null) {
			inorderRec(root.left);
			System.out.print(root.key+" ");
			inorderRec(root.right);
		}
		
		
	}
	
	/**
	 * @param key
	 * @return boolean
	 */
	public boolean search(int key) {
		Node found = search(root, key);
		if(found == null) {
			return false;
		}else
			return true;
	}
	
	/**
	 * @param root
	 * @param key
	 * @return
	 */
	private Node search(Node root,int key) {
		
		if(root==null || root.key==key) {
			return root;
		}
		if(root.key > key) {
			return search (root.left,key);
		}
		else {
			return search (root.right,key);
		}
	}
	
	public void delete(int key) {
		deleteRec(root,key);
	}
	private Node deleteRec(Node root,int key) {
		
		if(root==null) {
			return root;
		}
		
		if(root.key > key) {
			root.left = deleteRec(root.left, key);
		}else if(root.key<key) {
			root.right = deleteRec(root.right, key);
		}
		
		else {
			//One child or leaf node
			if(root.right == null) {
				return root.left;
			}else if(root.left ==null) {
				return root.right;
			}
			Node succ = root.right;
			while(succ.left!=null) {
				succ = succ.left;
			}
			root.key = succ.key;
			root.right = deleteRec(root.right, root.key);
			
			
		}	 
		
		return root;
			
	}
	

}
