package edu.bu.ec504.ganesh.datastructures;

import java.util.PriorityQueue;

public class Djikstra {

	
	public static void dijkstra(Graph graph,GraphNode root){
		PriorityQueue<GraphNode> queue = new PriorityQueue<>();
		root.setWeight(0);
		queue.add(root);
		
		while(!queue.isEmpty()){
			GraphNode node = queue.remove();
			//visit(node);
			int currentWeight = node.getWeight();
			if(null != graph.getAdjacencyList(node) && !node.visited){
				node.visited = true;
			for(GraphEdge edge : graph.getAdjacencyList(node)){
				if(edge!=null){
				GraphNode neighbor = edge.getNeighbor(node);
				
					evaluateNeighbor(neighbor,edge,currentWeight,node);
					
					queue.add(neighbor);
				
				}
			}
			}
		}
		
		
	}

	private static void evaluateNeighbor(GraphNode neighbor, GraphEdge edge, int currentWeight, GraphNode node) {
		
		if(currentWeight+edge.getWeight() < neighbor.getWeight()){
			neighbor.setWeight(currentWeight+edge.getWeight());
			neighbor.parent = node;
		}
		
	}

	
	
	
	
	
}
