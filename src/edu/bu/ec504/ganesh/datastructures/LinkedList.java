package edu.bu.ec504.ganesh.datastructures;
/**
 * 
 * @author Ganesh
 * A linked list implementation
 * @param <T>
 */
public class LinkedList<T> {

	private static class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data){
			this.data = data;
		}
	}
	
	private Node<T> head;
	
	/**
	 * Overloaded Method for inserting an element to the linked list when no position is provided. 
	 * It inserts the data to the head of the linked list.
	 * @param data
	 * @param pos
	 * @return
	 */
	public void add(T data){
		Node<T> newNode = new Node<T>(data);
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head= newNode;
		}
		
	}
	/**
	 * Overloaded Method for inserting an element to the linked list. 
	 * It inserts the data to the position specified in the argument
	 * @param data
	 * @param pos
	 * @return
	 */
	public boolean add(T data,int pos){
		Node<T> temp = new Node<T>(data);
		Node<T> n = this.head;
		int count =0;
		while(count<pos && n!=null){
			n = n.next;
		}
		if(n!=null){
			temp.next = n.next;
			n.next = temp;
			return true;
		}else{
			return false;
		}	
	}
	
	/**
	 * Function for deleting the first occurrence of "data" from the linked list
	 * @param data
	 */
	public void delete(T data){
		Node<T> temp = this.head;		
		
		while(temp!=null){
			if(temp.next.data == data){
				temp.next = temp.next.next;
				break;
			}
		}		
	}	
	
}
