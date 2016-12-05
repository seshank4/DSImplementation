package edu.bu.ec504.ganesh.datastructures;

public class GraphEdge {
	private GraphNode node1;
	private GraphNode node2;
	private int weight;
	
	public GraphEdge(GraphNode node1,GraphNode node2,int weight){
		this.node1 = node1;
		this.node2 = node2;
		this.weight = weight;
	}
	
	/**
	 * returns the adjacent node for a given node connected by this edge.
	 * @param node
	 * @return
	 */
	public GraphNode getNeighbor(GraphNode node){
		if(node.getData() == node1.getData()){
			return this.node2;
		}else{
			return this.node1;
		}
	}
	
	/**
	 * returns the weight of the edge
	 * @return
	 */
	public int getWeight(){
		return this.weight;
	}
	
}
