package con.learn.code;

public class FinMaxMinArray {
	
	public static void main(String args[]) {
		
		int arr[] = {2,8,10,87, 92,3};
		
		int max = findMax(arr);
		System.out.println("Max value is "+max);
		
		int min = findMin(arr);
		System.out.println("Min value is "+min);

	}
	
	public static int findMax(int[] arr) {
		
		int max = arr[0];
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		return max;
		
	}
	
	public static int findMin(int[] arr) {
		
		int min = arr[0];
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		return min;
		
	}

}
