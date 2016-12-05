package edu.bu.ec504.ganesh.datastructures;

/**
 * 
 * @author Ganesh
 *	Implementation of a Node of the Graph data structure
 */
public class GraphNode implements Comparable<GraphNode> {
	private String data;
	private int weight = Integer.MAX_VALUE;
	public boolean visited;
	public GraphNode parent;
	
	public GraphNode(String data,int weight){
		this.data = data;
		this.weight = weight;
	}
	
	public String getData(){
		return this.data;
	}
	
	public int getWeight(){
		return this.weight;
	}
	
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	@Override
	public boolean equals(Object o){
		GraphNode node = (GraphNode)o;
		if(null!= node.getData() && node.getData().equals(this.data)){
			return true;
		}		
		return false;		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public int compareTo(GraphNode o) {
		return Integer.compare(this.weight, o.getWeight());
	}

	public GraphNode getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}
}
