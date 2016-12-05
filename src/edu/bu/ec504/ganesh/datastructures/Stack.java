package edu.bu.ec504.ganesh.datastructures;

/**
 * 
 * @author Ganesh
 * Implementation of the stack data structure with pop, push and peek functions
 * @param <T>
 */
public class Stack<T> {

	private static class StackNode<T>{
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data){
			this.data = data;
		}
	}
	private StackNode<T> head;
	
	/**
	 * Removes an element from the top of the stack
	 * @return
	 */
	public T pop(){
		T data = null;
		data = head.data;
		head = head.next;		
		return data;
	}
	
	/**
	 * pushes an element to the top of the stack
	 * @param data
	 */
	public void push(T data){
		StackNode<T> node = new StackNode<T>(data);
		if(head==null){
			head = node;
		}else{
		node.next=head;
		head = node;
		}
	}
	
	/**
	 * returns the element at the top of the stack but does not remove it
	 * @return
	 */
	public T peek(){
		
		return head.data;
	}
}
