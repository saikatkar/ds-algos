package me.practice.tree;

import java.util.Stack;

/**
 * @author saikatkar1
 *
 */
public class BinarySearchTree {
	
	public Node root;
	
	/**
	 * @author saikatkar1
	 *
	 * @param <T>
	 */

	
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
		inorder(this.root);
	}
	public void inorder(Node root) {
		
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.key+" ");
			inorder(root.right);
		}
		
		
	}
	
	/**
	 * @param root
	 */
	public static void inorderStack(Node root) {
		
		Stack <Node> stack = new Stack<Node>();
		Node node = root;
		while(!stack.isEmpty() || node!=null) {
			while(node!=null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			System.out.print(node.key + " ");
			node = node.right;
			
		}
		
	}
	
	public static void preorderStack(Node root) {
		
		Stack <Node> stack = new Stack<Node>();
		Node node = root;
		while(!stack.isEmpty() || node!=null) {
			while(node!=null) {
				System.out.print(node.key+" ");
				stack.push(node);
				node = node.left;
			}
			node=stack.pop();
			node = node.right;
			//System.out.print(node.key + " ");

			
		}
		
	}
	
	public static void postorderStack(Node root) {
		
		Stack <Node> stack = new Stack<Node>();
		Node node = root;
		while(!stack.isEmpty() || node!=null) {
			while(node!=null) {
				if(node.right!=null) {
					stack.push(node.right);
				}
				stack.push(node);
				node = node.left;
			}
			node=stack.pop();
			if(node.right!=null && !stack.isEmpty() && node.right.key == stack.peek().key) {
				Node temp = stack.pop();
				stack.push(node);
				node = temp;
			}else {
				System.out.print(node.key + " ");
				node = null;
			}
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
	/**
	 * @param key
	 * @return
	 */
	public boolean searchIterative(int key) {
		Node found = searchIterative(root, key);
		if(found == null) {
			return false;
		}else {
			return true;
		}
	}
	/**
	 * @param root
	 * @param key
	 * @return
	 */
	private Node searchIterative(Node root,int key) {
		if(root==null || root.key ==key) {
			return root;
		}
		
		while(root!=null) {
			if(root.key > key) {
				root = root.left;
			}else if(root.key < key) {
				root = root.right;
			}else {
				
				return root;
			}
		}
		return root;
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
	
	public int size(Node root) {
		
		if(root ==null) {
			return 0;
		}
		
		return size(root.left) + size(root.right)+1;
	}
	

}
