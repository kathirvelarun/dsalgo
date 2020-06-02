package con.learn.code.ds.arrays;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String args[]) {
		
		int arr[]= {8,4,1};

		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

		
	}

	private static void selectionSort(int[] arr) {
		
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			int iMin = i;
			
			for(int j = i+1; j<n;j++) {
				System.out.println(" j " + j +" arr[j] "+arr[j]);
				System.out.println(" iMin " + iMin +" arr[iMin] "+arr[iMin]);
				if(arr[j] < arr[iMin]) {
					iMin = j;
				}
			}
				//Start Swap
				int temp = arr[i];
				arr[i] = arr[iMin];
				arr[iMin] = temp;
				
		}
		
	}

}
