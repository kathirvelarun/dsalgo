package con.learn.code.problems;

public class FindMissingArray {
	
	public static void main(String args[]) {
		
		int arr[]= {0,1,3};
		
		int missingNum = findMissingNumber(arr); 
		
		System.out.println(" Missing Number "+missingNum);
		
	}

	private static int findMissingNumber(int[] arr) {
		
		int sum = 0;
		int n = arr.length+1;
		
		for(int i:arr) {
			sum = sum + i;
		}
		
		//Math
		int math = (n*(n-1)/2);
		System.out.println(" math "+math);
		
		return (n*(n-1)/2) - sum;
		
		
		
	}
	

}
