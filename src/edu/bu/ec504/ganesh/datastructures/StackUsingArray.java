package edu.bu.ec504.ganesh.datastructures;

public class StackUsingArray {

	private int[] arr;
	private int size;
	private int head;

	StackUsingArray() {
		arr = new int[100];
		size = 100;
		this.head = -1;
	}

	StackUsingArray(int size) {
		arr = new int[size];
		this.size = size;
		this.head = -1;
	}

	public boolean push(int num) {

		if (head < size-1) {
			arr[++head] = num;
			return true;
		} else {
			return false;
		}

	}

	public Integer pop() {

		if (head >= 0) {
			return arr[head--];
		} else{
			return null;
		}
	}

}
