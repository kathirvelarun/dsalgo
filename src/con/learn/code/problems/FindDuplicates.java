package con.learn.code.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {
	
	public static void main(String args[]) {
	
	int arr[]= {0,1,2,2,3};
	
	int missingNum = findDuplicatesNumber(arr); 
	
	System.out.println(" Duplicate  "+missingNum);
	
	}

	private static int findDuplicatesNumber(int[] arr) {
		
		int duplicate = 0;
		
		Set<Integer> store = new HashSet<Integer>();
		for(int value:arr) {
			if(store.add(value) == false) {
				duplicate = value;
			}
		}
		return duplicate;
		
	}

}
