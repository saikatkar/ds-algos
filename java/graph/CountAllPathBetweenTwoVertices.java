package graph;

import java.util.Arrays;

/**
 * Count all possible paths between two vertices
Count the total number of ways or paths that exist between two vertices in a directed graph. 
These paths doesn’t contain a cycle, the simple enough reason is that a cylce contain 
infinite number of paths and hence they create problem.
 * @author saikatkar
 *
 */
public class CountAllPathBetweenTwoVertices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g = new Graph(4); 
	    g.addEdge(0, 1); 
	    g.addEdge(0, 2); 
	    g.addEdge(0, 3); 
	    g.addEdge(2, 0); 
	    g.addEdge(2, 1); 
	    g.addEdge(1, 3); 
	    
	    boolean visited[] = new boolean[g.vertex];

	    System.out.println(countPathBetweenTwoVertices(2, 3, visited, 0, g));
		

	}
	
	public static int countPathBetweenTwoVertices(int u,int v,boolean [] visited,int pathCount,Graph graph) {
		
		visited[u] = true;
		
		if(u == v) {
			
			 pathCount++;
			 
			 
		}else {
		
			for(int e : graph.adj[u]) {
				
				if(!visited[e]) {
					pathCount =  countPathBetweenTwoVertices(e, v, visited, pathCount, graph);
				}
			}
		}
		visited[u] = false;
		
		return pathCount;
		
	}

}
