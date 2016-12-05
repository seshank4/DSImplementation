package edu.bu.ec504.ganesh.datastructures;

/**
 * 
 * @author Ganesh
 * Implementation of the queue data structure wit add, remove, peek and isEmpty funtions
 * @param <T>
 */
public class Queue<T> {

	private static class QueueNode<T>{
		private T data;
		private QueueNode<T> next;
		
		public QueueNode(T data){
			this.data = data;
		}
	}
	
	private QueueNode<T> head;
	private QueueNode<T> tail;
	
	/**
	 * Removes an element from the beginning of the queue
	 * @return
	 */
	public T remove(){
		T item = head.data;	
		head = head.next;
		if(head==null){
			tail = null;
		}
		return item;
	}
	
	/**
	 * Adds an element to the end of the queue
	 * @param item
	 */
	public void add(T item){
		QueueNode<T> temp = new QueueNode<T>(item);
		if(tail!=null){
		tail.next = temp;
		}
		tail = temp;
		if(head==null){
			head = tail;
		}
	}
	
	/**
	 * Returns the value at the beginning of the queue but does not remove it from the queue
	 * @return
	 */
	public T peek(){
		if(head!=null){
		return head.data;
		}else{
			return null;
		}
		
	}
	
	/**
	 * Return true if queue is empty else return false
	 * @return
	 */
	public boolean isEmpty(){
		if(head==null){
			return true;
		}
		return false;
	}
}
