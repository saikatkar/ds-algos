package graph;

import java.util.LinkedList;

public class Graph {

	public int vertex;
	public LinkedList<Integer> adj[];
	
	public Graph(int vertex) {
		this.vertex = vertex;
		this.adj = new LinkedList[vertex];
		
		for(int i =0 ;i<vertex;i++) {
			adj[i] = new LinkedList<Integer>();
		}
		
	}
	public void addEdge(int v,int w) {
		this.adj[v].add(w);
	}
}
