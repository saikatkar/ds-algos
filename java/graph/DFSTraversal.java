package graph;

public class DFSTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        
        boolean visited[] = new boolean[4];
        
        traverseDFS(2,visited,g);

	}
	
	public static void traverseDFS(int start,boolean visited[],Graph graph) {
		
		
		visited[start] = true;
		System.out.print(start+" ");
		for(int e : graph.adj[start]) {
			
			if(!visited[e]) {
				traverseDFS(e, visited, graph);
			}
		}
		
	}

}
