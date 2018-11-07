package me.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author saikatkar1
 *
 */
public class ConstructBSTFromLevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {7, 4, 12, 3, 6, 8, 1, 5, 10};
		ConstructBSTFromLevelOrder constructBSTFromLevelOrder = new ConstructBSTFromLevelOrder();
		Node root = constructBSTFromLevelOrder.construct(arr);
		
		BinarySearchTree.inorderStack(root);

	}
	
	private Node construct(int arr[]) {
		Queue<NodeDetails> queue = new LinkedList<>();
		NodeDetails root = new NodeDetails(arr[0],Integer.MIN_VALUE,Integer.MAX_VALUE);
		queue.add(root);
		NodeDetails prevNode = null;
		for(int i=1;i<arr.length;) {
			NodeDetails node = null;
			prevNode = queue.poll();
			if(arr[i] > prevNode.minValue && arr[i] < prevNode.key) {
				node = new NodeDetails(arr[i], prevNode.minValue, prevNode.key);
				prevNode.left = node;
				
				queue.add(node);
				i++;
			}
			if(arr[i] > prevNode.key && arr[i] < prevNode.maxValue) {
				node = new NodeDetails(arr[i],prevNode.key,prevNode.maxValue);
				prevNode.right = node;
				
				queue.add(node);
				i++;
			}
			
				
		}
		return root;
	}

}
