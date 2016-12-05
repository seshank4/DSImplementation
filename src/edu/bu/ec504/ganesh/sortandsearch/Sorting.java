package edu.bu.ec504.ganesh.sortandsearch;

/**
 * 
 * @author Ganesh
 *	Implementation of common sorting algorithms 
 */
public class Sorting {

	/**
	 * Implementation of the bubble sort algorithm. Takes an array as an input and sorts it.
	 * @param elements
	 */
	public static void bubbleSort(int[] elements){
	
		int n = elements.length;
		
		for(int i=n-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(elements[j]>elements[j+1]){
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
		
		for(int i : elements){
			System.out.println(i);
		}
	}
	
	/**
	 * Selection sort implementation. Takes an array as an input and sorts it.
	 * @param elements
	 */
	public static void selectionSort(int[] elements){
		
		int n = elements.length;
		int minIndex = 0;
		
		for(int i=0;i<n;i++){
			int min = elements[i];
			for(int j=i+1;j<n;j++){
				if(elements[j]<min){
					min = elements[j];
					minIndex = j;
				}
			}
			if(elements[i]>min){
				int temp = elements[i];
				elements[i] = elements[minIndex];
				elements[minIndex] = temp;
			}
		}
		
		for(int i : elements){
			System.out.println(i);
		}
	}
	
	/**
	 * Insertion sort implementation. Takes an array as an input and sorts it.
	 * @param elements
	 */
	public static void insertionSort(int[] elements){
		
		int n = elements.length;
		
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j>0&&elements[j-1]>elements[j];j--){
					int temp = elements[j];
					elements[j] = elements[j-1];
					elements[j-1] = temp;
			}
		}
		
		for(int x : elements){
			System.out.println(x);
		}
		
	}
	
	
	/**
	 * Merge sort implementation. Takes an array as an input and sorts it.
	 * @param input
	 */
	public static void mergeSort(int[] input){
		
		int[] arr = new int[input.length];
		mergeSortRecursive(input,arr,0,arr.length-1);
	}
	
	/**
	 * Recursive method for merge sort. This function has been made private to prevent direct access.
	 * @param input
	 * @param input
	 * @param arr
	 * @param start
	 * @param end
	 */
	private static void mergeSortRecursive(int[] input,int[] arr,int start,int end){	
		
		if(start == end){
			return;
		}else{
			int mid = (start+end)/2;			
			mergeSortRecursive(input,arr,start,mid);
			mergeSortRecursive(input,arr,mid+1,end);			
			merge(input,arr, start,mid,end);			
		}		
	}
	
	/**
	 * merge function of the merge sort algorithm. It merges to sorted arrays into a single sorted array.
	 * This function has been made private to prevent direct access.
	 * @param input
	 * @param arr
	 * @param start
	 * @param mid
	 * @param end
	 */
	private static void merge(int[]input,int[] arr,int start,int mid,int end){		
		
		int low = mid+1;
		int j=0;
		int n = end - start + 1;		
		int first = start;
		
		while( start<=mid &&  low<=end){
			if(input[start]<input[low]){
				arr[j] = input[start];
				j++;
				start++;
			}else{
				arr[j] = input[low];
				j++;
				low++;
			}
		}
		
		while(start<=mid){
			arr[j]=input[start];
			j++;
			start++;			
		}
		
		while(low<=end){
			arr[j]=input[low];
			j++;
			low++;
		}
		
		for(int k=first;k<end;k++){
			input[k] = arr[k];
		}			
		
	}
	
}
