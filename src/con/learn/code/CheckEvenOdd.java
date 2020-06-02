package con.learn.code;

public class CheckEvenOdd {
	
	public static void main(String args[]) {
		
		int a[] = {2,4,1,5,20,63,88,9};
		
		//Divisible by 2
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				System.out.println("Print the Even Number "+a[i]);
			}
		}
		
		//Not Divisible by 2
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 != 0) {
				System.out.println("Print the Odd Number "+a[i]);
			}
		}
		
	}

}
