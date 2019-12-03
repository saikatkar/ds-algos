package graph;
import java.util.LinkedList;
import java.util.Queue;

import graph.Graph;

public class BFSTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g = new Graph(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        
        traverseBFS(g, 2);

	}
	
	public static void traverseBFS(Graph graph,int startingVertex) {
		
		
		boolean[] visited = new boolean[graph.vertex];
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		visited[startingVertex] = true;
		queue.add(startingVertex);
		
		while(queue.size() != 0) {
			
			int s = queue.poll();
			System.out.print(s+ " ");
			
			for(int e : graph.adj[s]) {
				if(!visited[e]) {
					visited[e] = true;
					queue.add(e);	
				}
				
				
			}
		}
		
		
	}

}
