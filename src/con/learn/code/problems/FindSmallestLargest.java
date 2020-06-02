package con.learn.code.problems;

import java.util.HashSet;
import java.util.Set;

public class FindSmallestLargest {
	
	public static void main(String args[]) {
		
		int arr[]= {8,2,4,9,6};
		
		findSmallestLargest(arr); 
		
		
		}

		private static void findSmallestLargest(int[] arr) {
			
			int largest = arr[0];
			int smallest = arr[0];
			
			for(int i: arr) {
				
				if(i > largest) {
					largest = i;
				}
				else if(i < smallest) {
					smallest = i;
				}
			}
			
			System.out.println(" Largest "+largest);
			System.out.println(" Smallest "+smallest);
			

			
		}

}
