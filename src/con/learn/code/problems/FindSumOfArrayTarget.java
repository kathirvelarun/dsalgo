package con.learn.code.problems;

import java.util.HashMap;
import java.util.Map;

public class FindSumOfArrayTarget {

	public static void main(String[] args) {
		
		int arr[] = {2,6,10,18,3,4,1};
		int target = 14;
		
		findSum(arr, target);
			

	}

	private static void findSum(int[] arr, int target) {
		
		//Find the length
		int length = arr.length;
		
		//Initialise result
		int result[] = new int[2];
		
		//Set the Map
		Map<Integer, Integer> store= new HashMap();
		
		for(int i=0;i<length;i++) {
			
			if(store.get( target-arr[i]) == null) {
				store.put(arr[i], i);
				
			}
			else {
				
				result[0] = store.get( target-arr[i]);
				result[1] = i;
				
			}
			
			
		}
		
		
		System.out.println(" Result [0] " +result[0]);
		System.out.println(" Result [1] " +result[1]);
		
		System.out.println(" Result [0] " +arr[result[0]]);
		System.out.println(" Result [1] " +arr[result[1]]);
		
	}

}
