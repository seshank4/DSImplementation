package edu.bu.ec504.ganesh.sortandsearch;

import edu.bu.ec504.ganesh.datastructures.Graph;
import edu.bu.ec504.ganesh.datastructures.GraphEdge;
import edu.bu.ec504.ganesh.datastructures.GraphNode;
import edu.bu.ec504.ganesh.datastructures.Queue;

/**
 * 
 * @author Ganesh
 * Implementation of search algorithms for searching a graph
 *
 */
public class GraphSearch {
	
	/**
	 * DFS implementation for searching the entire graph
	 * @param graph
	 * @param root
	 */
	public static void depthFirstSearch(Graph graph,GraphNode root){
		
		if(root==null){
			return;
		}
		visit(root);
		for(GraphEdge edge : graph.getAdjacencyList(root)){
			GraphNode neighbor = edge.getNeighbor(root);
			if(!neighbor.visited){
			depthFirstSearch(graph,neighbor);
			}
		}
	}
	
	/**
	 * BFS implementation for searching the entire graph
	 * @param graph
	 * @param root
	 */
	public static void breadthFirstSearch(Graph graph,GraphNode root){
		Queue<GraphNode> queue = new Queue<GraphNode>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			GraphNode node = queue.remove();
			visit(node);
			for(GraphEdge edge : graph.getAdjacencyList(node)){
				GraphNode neighbor = edge.getNeighbor(node);
				if(!neighbor.visited){
					neighbor.visited = true;
					queue.add(neighbor);
				}
			}
		}		
	}

	/**
	 * function that performs the visit
	 * @param node
	 */
	private static void visit(GraphNode node) {
		node.visited = true;
		System.out.println(node.getData());
	}
}
