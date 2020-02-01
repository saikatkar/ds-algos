package graph;

import java.util.Arrays;
import java.util.Stack;

import graph.WeightedGraph.AdjNode;

/**
 * Given a Weighted Directed Acyclic Graph (DAG) and a source vertex s in it, find the longest distances from s to all other vertices in the given graph.
The longest path problem for a general graph is not as easy as the shortest path problem because the longest path problem doesn’t have optimal substructure property.
 In fact, the Longest Path problem is NP-Hard for a general graph. However, the longest path problem has a linear time solution for directed acyclic graphs. 
 The idea is similar to linear time solution for shortest path in a directed acyclic graph., we use Topological Sorting.
 * @author saikatkar
 *
 */
public class LongestPathDAG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeightedGraph g = new WeightedGraph(6);
		g.addEdge(0, 1, 5);  
	    g.addEdge(0, 2, 3);  
	    g.addEdge(1, 3, 6);  
	    g.addEdge(1, 2, 2);  
	    g.addEdge(2, 4, 4);  
	    g.addEdge(2, 5, 2);  
	    g.addEdge(2, 3, 7);  
	    g.addEdge(3, 5, 1);  
	    g.addEdge(3, 4, -1);  
	    g.addEdge(4, 5, -2);
	    
	    int arr [] = getLongestPath(1, g);
	    System.out.println(Arrays.toString(arr));

	}
	
	public static int[] getLongestPath(int s ,WeightedGraph graph) {
		
		int [] dist = new int[graph.vertex];
		
		Arrays.fill(dist, Integer.MIN_VALUE);
		dist[s] = 0;
		boolean [] visited = new boolean[graph.vertex];
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<graph.vertex;i++) {
			
			if(!visited[i]) {
				topologicalSort(i, stack, visited, graph);
			}
		}
		System.out.println(stack.toString());
		
		while(!stack.isEmpty()) {
			int u = stack.pop();
			
			for(AdjNode v : graph.adj[u]) {
				
				if(dist[v.adjVertex] < dist[u]+v.weight) {
					dist[v.adjVertex] = dist[u]+v.weight;
				}
			}
		}
		
		return dist;
	}
	
	private static void topologicalSort(int v,Stack<Integer> stack,boolean[] visited,WeightedGraph graph) {
		visited[v] = true;
		
		for(AdjNode i : graph.adj[v]) {
			
			if(!visited[i.adjVertex]) {
				topologicalSort(i.adjVertex, stack, visited, graph);
			}
		}
		stack.push(v);
	}

}
