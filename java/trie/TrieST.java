package trie;

import java.util.ArrayList;
import java.util.List;

/**
 * This implementation uses a 256-way trie.
 * @author saikatkar
 *
 */
public class TrieST {
	
	private static final int R = 256;
	
	private Node root;
	
	private static class Node{
		
		private Object value;
		
		private Node [] next = new Node[R];
		
		private boolean isWord = false;
		
		
	}
	
	public void insert(String key) {
		
		if(key == null) {
			throw new IllegalArgumentException("Key is null");
		}
		root = insert(key,root,0);
	}
	
	private Node insert(String key,Node node,int d) {
		
		if(node == null) {
			node = new Node();
		}
		if(d == key.length()) {
			node.isWord = true;
			return node;
		}
		
		char c = key.charAt(d);
		node.next[c] = insert(key, node.next[c], d+1);
		return node;
	}
	
	public Node get(String key) {
		
		if(key == null) {
			
			throw new IllegalArgumentException();
		}
		
		Node node = get(key,root,0);
		return node;
		
	}
	
	private Node get(String key,Node node,int d) {
		
		if(d == key.length()) {
			return node;
		}
		char c = key.charAt(d);
		return get(key,node.next[c],d+1);
	}
	
	public List<String> startWithKeys(String prefix){
		
		Node node = get(prefix);
		List<String> collection = new ArrayList<String>();
		if(node == null) {
			return collection;
		}
		collect(prefix,node,collection);
		return collection;
	}
	
	private void collect(String prefix,Node node,List<String> collection) {
		if(node == null) 
			return;
		if(node.isWord) {
			collection.add(prefix);
		}
		for(char c=0;c<R;c++) {
			
			prefix += c;
			collect(prefix,node.next[c],collection);
			prefix = prefix.substring(0,prefix.length()-1);
		} 
	}
		
		

}
