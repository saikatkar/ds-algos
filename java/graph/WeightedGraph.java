package graph;

import java.util.LinkedList;

public class WeightedGraph {
	
	int vertex;
	LinkedList<AdjNode> adj[];
	
	static class AdjNode{
		
		int adjVertex;
		int weight;
		
		public AdjNode(int v,int w) {
			
			this.adjVertex = v;
			this.weight = w;
		}
		
	}
	
	public WeightedGraph(int v) {
		
		this.vertex = v;
		this.adj = new LinkedList[v];
		
		for(int i =0;i<v;i++) {
			adj[i] = new LinkedList<WeightedGraph.AdjNode>();
		}
	}
	
	public void addEdge(int u,int v,int w) {
		
		AdjNode adjNode = new AdjNode(v,w);
		this.adj[u].add(adjNode);
	}

}
