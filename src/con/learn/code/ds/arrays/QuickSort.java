package con.learn.code.ds.arrays;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {7,8,3,2,6,1,9,5,4};
		quickSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

		
		
	}


	private static void quickSort(int[] arr, int start, int end) {
		
		//Base condition
		if(start<end) {
			
			// partition Index
			int pIndex = partition(arr, start, end);
					
			//QuickSort Recursive
			quickSort(arr, start, pIndex-1);
			quickSort(arr, pIndex+1, end);
			
		}
		
	}

	private static int partition(int[] arr, int start, int end) {
		
		//Set the Pivot
		int pivot = arr[end];
		
		//Set the Partition Index
		int pIndex = start - 1 ;
		
		for(int i=start ;i<end; i++) {
			
			if(arr[i]<=pivot) {
				
			pIndex++;
		
			//Swap if the element is lesser than pivot
			int temp = arr[pIndex];
			arr[pIndex] = arr[i];
			arr[i] = temp;
			

			
			}
		}
		//Swap pivot element with partition Index
		int temp = arr[pIndex + 1];
		arr[pIndex + 1] = arr[end];
		arr[end] = temp;
		
		return pIndex+1;
		
	}

}
