package graph;

/**
 * Detect Cycle in a Directed Graph
Given a directed graph, check whether the graph contains a cycle or not. 
Your function should return true if the given graph contains at least one cycle, else return false.
 For example, the following graph contains three cycles 0->2->0, 0->1->2->0 and 3->3, so your function must return true.
 * @author saikatkar
 *
 */
public class CycleDetectionDirectedGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(4); 
        graph.addEdge(0, 1); 
        graph.addEdge(0, 2); 
        graph.addEdge(1, 2); 
        graph.addEdge(2, 0); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 3); 
          
        if(isCyclic(graph)) 
            System.out.println("Graph contains cycle"); 
        else
            System.out.println("Graph doesn't "
                                    + "contain cycle"); 

	}
	
	public static boolean isCyclic(Graph graph) {
		
		boolean [] visited = new boolean[graph.vertex];
		boolean [] recStack = new boolean[graph.vertex];
		
		for(int i =0;i<graph.vertex;i++) {
			if(isCyclicUtil(i,graph, visited, recStack)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isCyclicUtil(int i ,Graph graph,boolean visited[],boolean recStack[]) {
		
		if(recStack[i]) {
			return true;
		}
		if(visited[i]) {
			return false;
		}
		visited[i] = true;
		recStack[i] = true;
		for(int v : graph.adj[i]) {
			if(!visited[v]) {
				return isCyclicUtil(v, graph, visited, recStack);
			}
		}
		
		recStack[i] = false;
		return false;
	}

}
