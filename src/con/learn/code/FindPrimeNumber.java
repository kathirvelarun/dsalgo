package con.learn.code;

public class FindPrimeNumber {
	
	public static void main(String args[]) {
		
		int num=2;
		
		//Prime number is divisible by 1 or by itself
		
		boolean isPrime = findPrimeNumber(num);
		if(!isPrime)
			System.out.println(" Number "+num+ " is Prime number");
		else
			System.out.println(" Number "+num+ " is not Prime number");
	}
	
	public static boolean findPrimeNumber(int num) {
		
		boolean isPrime = false;
		int size = num/2;
		
		for(int i=2;i<=size; ++i) {
			
			//Condition of nonprime number 
			if(num%i == 0) {
				isPrime = true;
				break;
			}
		}
		
		return isPrime;
	}

}
