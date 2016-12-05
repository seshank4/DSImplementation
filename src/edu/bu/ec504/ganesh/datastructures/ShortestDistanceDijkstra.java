package edu.bu.ec504.ganesh.datastructures;

public class ShortestDistanceDijkstra {

	static Graph graph = null;
	
	
	public static void getShortestDistance(GraphNode node1, GraphNode node2){
		
		Djikstra.dijkstra(graph, node1);
		GraphNode temp = node2;
		
		while(temp!=null){
			System.out.print(temp.getData() +" --->" );
			temp = temp.getParent();
		}
	}
	
	
	
	public static void main(String[] args){
		
		graph = new Graph();
		
		GraphNode node1 = new GraphNode("A",Integer.MAX_VALUE);
		GraphNode node2 = new GraphNode("B",Integer.MAX_VALUE);
		GraphNode node3 = new GraphNode("C",Integer.MAX_VALUE);
		GraphNode node4 = new GraphNode("D",Integer.MAX_VALUE);
		GraphNode node5 = new GraphNode("E",Integer.MAX_VALUE);
		GraphNode node6 = new GraphNode("F",Integer.MAX_VALUE);
		GraphNode node7 = new GraphNode("G",Integer.MAX_VALUE);
		GraphNode node8 = new GraphNode("H",Integer.MAX_VALUE);
		
		graph.insertEdge(node1, node2, 23);
		graph.insertEdge(node1, node3, 7);
		graph.insertEdge(node1, node4, 9);
		graph.insertEdge(node2, node5, 5);
		graph.insertEdge(node2, node8, 10);
		graph.insertEdge(node3, node6, 4);
		graph.insertEdge(node3, node4, 1);
		graph.insertEdge(node4, node6, 93);
		graph.insertEdge(node5, node3, 2);
		graph.insertEdge(node5, node8, 11);
		graph.insertEdge(node5, node6, 6);
		graph.insertEdge(node6, node7, 7);
		graph.insertEdge(node5, node7, 22);
		
		getShortestDistance(node1, node4);
		
		
		
		
		
		
		
		
	}
}
