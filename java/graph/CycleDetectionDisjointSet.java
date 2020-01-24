package graph;

import java.util.Arrays;

public class CycleDetectionDisjointSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph graph = new Graph(4); 
        graph.addEdge(0, 1); 
        graph.addEdge(0, 2); 
        graph.addEdge(2, 1); 
        //graph.addEdge(2, 0); 
        graph.addEdge(2, 3); 
        //graph.addEdge(3, 3); 
        System.out.println(isCyclic(graph));

	}
	
	public static boolean isCyclic(Graph graph) {
		
		int [] parent = new int[graph.vertex];
		Arrays.fill(parent, -1);
		for(int i =0;i<graph.vertex;i++) {
			
			for(int e : graph.adj[i]) {
				
				int iParent = find(parent, i);
				int eParent = find(parent, e);
				
				if(iParent == eParent) { // This means both the vertex is in same set.
					return true;
				}
				union(parent, i, e);
			}
		}
		return false;
	}
	
	private static int find(int [] parent,int i) {
		
		if(parent[i] == -1) {
			return i;
		}
		return find(parent,parent[i]);
	}
	
	private static void union(int [] parent,int x ,int y) {
		
		parent[y] = x ;
	}

}
