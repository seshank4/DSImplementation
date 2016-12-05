package edu.bu.ec504.ganesh.datastructures;

public class QueueUsingArray {

	private int[] arr;
	private int head;
	private int tail;
	private int maxsize;
	private int currsize;

	QueueUsingArray() {
		arr = new int[100];
		maxsize = 100;
		head = -1;
		tail = -1;
	}

	QueueUsingArray(int size) {
		arr = new int[size];
		maxsize = size;
		head = 0;
		tail = -1;
	}

	public boolean push(int data) {

		if (tail == maxsize -1) {
			tail = -1;
		}

		if (currsize < maxsize) {
			arr[++tail] = data;
			currsize++;
			return true;
		} else {
			return false;
		}
	}

	public Integer pop() {

		if(head==maxsize && currsize<maxsize){
			head = 0;
		}
		if (currsize > 0) {
			currsize--;
			return arr[head++];
		} else {
			return null;
		}
	}

}
