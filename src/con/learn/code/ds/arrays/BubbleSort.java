package con.learn.code.ds.arrays;

public class BubbleSort {

	public static void main(String args[]) {

		int arr[] = { 12, 8, 7, 77, 56, 4 , 88};

		/// int temp = 0;
		
		int endOfOuter = arr.length;
		//System.out.println(" end of outer loop "+endOfOuter);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" end of outer loop "+endOfOuter);
			int endOfInner = arr.length-i-1;
			System.out.println(" end of inner loop "+endOfInner);
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(" Sorted Array "+arr[i]);

			
		}

	}

}
