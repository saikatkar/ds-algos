package graph;

import java.util.Stack;

/**
 * Topological sorting for Directed Acyclic Graph (DAG) is a linear ordering of vertices such that for every directed edge uv, 
 * vertex u comes before v in the ordering. Topological Sorting for a graph is not possible if the graph is not a DAG.
For example, a topological sorting of the following graph is “5 4 2 3 1 0”. There can be more than one topological sorting for a graph. 
For example, another topological sorting of the following graph is “4 5 2 3 1 0”. 
The first vertex in topological sorting is always a vertex with in-degree as 0 (a vertex with no incoming edges).

Topological Sorting vs Depth First Traversal (DFS):
In DFS, we print a vertex and then recursively call DFS for its adjacent vertices. In topological sorting, we need to print a vertex before its adjacent vertices. For example, in the given graph, the vertex ‘5’ should be printed before vertex ‘0’, but unlike DFS, the vertex ‘4’ should also be printed before vertex ‘0’. So Topological sorting is different from DFS. For example, a DFS of the shown graph is “5 2 3 1 0 4”, but it is not a topological sorting
 * @author saikatkar
 * 
 * 
 *
 */
public class ToplogicalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(6); 
        g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 
        topologicalSort(g);
	}
	
	public static void topologicalSort(Graph graph) {
		
		Stack<Integer> stack = new Stack<Integer>();
		boolean[] visited = new boolean[graph.vertex];
		
		for(int i =0 ;i<graph.vertex; i++) {
			
			if(!visited[i]) {
				topologicalSortUtil(i, stack, visited,graph);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
	
	private static void topologicalSortUtil(int i,Stack<Integer> stack, boolean [] visited, Graph graph) {
		
		visited[i] = true;
		
		for(int e : graph.adj[i]) {
			if(!visited[e]) {
				topologicalSortUtil(e, stack, visited, graph);
			}
		}
		stack.push(i);
	}

}
