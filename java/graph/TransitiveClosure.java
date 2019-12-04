package graph;

import java.util.Arrays;

/**
 * Given a directed graph, find out if a vertex v is reachable from another vertex u for all vertex pairs (u, v) in the given graph. 
 * Here reachable mean that there is a path from vertex u to v. The reach-ability matrix is called transitive closure of a graph.
 * @author saikatkar
 *
 */
public class TransitiveClosure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        
        transitiveClosure(g);
        
        
	}
	
	public static void transitiveClosure(Graph graph) {
		
		int [][] tc = new int[graph.vertex][graph.vertex];
		
		for(int i =0;i<graph.vertex;i++) {
			dfsUtil(graph, tc,i,i);
		}
		
		System.out.println(Arrays.deepToString(tc));
	}
	
	private static void dfsUtil(Graph graph, int [][] tc,int s,int v) {
		
		tc[s][v] = 1;
		
		for(int e : graph.adj[v]) {
			if(tc[s][e]!=1) {
				dfsUtil(graph, tc, s, e);
			}
		}
	}

}
