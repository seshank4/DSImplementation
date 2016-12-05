package edu.bu.ec504.ganesh.datastructures;

public class BST {
	
	private BSTNode root;
	
	
	public void insert(BSTNode node){
		
		BSTNode newNode = new BSTNode();
		
		newNode.data = node.data;	
		
		if(root==null){
			root = newNode;
		}else{			
			BSTNode current = root;
			BSTNode parent = null;
			while(true){
				parent = current;
				if(newNode.data<parent.data){
					current = current.leftChild;
					if(current == null){
						parent.leftChild = newNode;
						break;
					}
				}else{
					current = current.rightChild;
					if(current == null){
						parent.rightChild = newNode;
						break;
					}
				}				
			}
		}
	}
	
	public void delete(int key){
		
		
	}
	
}
