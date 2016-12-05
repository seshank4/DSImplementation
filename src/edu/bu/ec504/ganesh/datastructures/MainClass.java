package edu.bu.ec504.ganesh.datastructures;

public class MainClass {

	public static void main(String[] args) {
		
					
		/*QueueUsingArray stack = new QueueUsingArray(3);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push(4);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());*/
		
		BST tree = new BST();
		
		BSTNode node = new BSTNode();		
		node.data = 45;
		BSTNode node1 = new BSTNode();		
		node1.data = 23;
		BSTNode node2 = new BSTNode();		
		node2.data = 10;
		BSTNode node3 = new BSTNode();		
		node3.data = 65;
		BSTNode node4 = new BSTNode();		
		node4.data = 4;
		BSTNode node5 = new BSTNode();		
		node5.data = 77;
		BSTNode node6 = new BSTNode();		
		node6.data = 433;
		BSTNode node7 = new BSTNode();		
		node7.data = 34;
		BSTNode node8 = new BSTNode();		
		node8.data = 66;
		BSTNode node9 = new BSTNode();		
		node9.data = 87;
		
		tree.insert(node);
		tree.insert(node1);		
		tree.insert(node2);
		tree.insert(node3);
		tree.insert(node4);
		tree.insert(node5);
		tree.insert(node6);
		tree.insert(node7);
		tree.insert(node8);
		tree.insert(node9);
		
		
	}
	
	

}
