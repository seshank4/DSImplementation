package edu.bu.ec504.ganesh.datastructures;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author Ganesh
 * Implementation of the Graph data structure with functionality to insert and remove nodes and edges
 *
 */
public class Graph {
	
	HashMap<GraphNode,ArrayList<GraphEdge>> map;
	
	private int nodeCount;
	
	public Graph(){
		this.map = new HashMap<GraphNode,ArrayList<GraphEdge>>();
	}
	
	/**
	 * Inserts a edge between node1 to node 2
	 * @param node1
	 * @param node2
	 */
	public void insertEdge(GraphNode node1,GraphNode node2,int weight){
				
		GraphEdge edge = new GraphEdge(node1, node2, weight);
		addEdgeToMap(node1,edge);
		//addEdgeToMap(node2,edge);		
	}

	/**
	 * Adds the edge to the map
	 * @param node
	 * @param edge
	 */
	private void addEdgeToMap(GraphNode node, GraphEdge edge) {
		if(map.containsKey(node)){
			ArrayList<GraphEdge> adjacencyList = map.get(node);
			adjacencyList.add(edge);
		}else{
			ArrayList<GraphEdge> adjacencyList = new ArrayList<>();
			adjacencyList.add(edge);
			map.put(node, adjacencyList);
		}
		
	}
	
	/**
	 * Return the array list of neighbors of a node
	 * @param node
	 * @return
	 */
	public ArrayList<GraphEdge> getAdjacencyList(GraphNode node){
		return map.get(node);
	}
	
	public int getNodeCount(){
		return this.nodeCount;
	}
}
