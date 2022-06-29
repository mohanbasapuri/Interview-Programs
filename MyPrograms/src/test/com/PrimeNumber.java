package test.com;

public class PrimeNumber {

	private static boolean isPrimeNumber(int N) {
		
		 for(int i=2;i<N/2;i++){
             if(N%i==0){
                 return false;
             }
         }
		return true;  
	}
	
	
	public static void main(String[] args) {
		System.out.println("Hi There!!!!");
		int num=53;
		if(isPrimeNumber(num)) {
			System.out.println(num);
		}
	}

	
}
