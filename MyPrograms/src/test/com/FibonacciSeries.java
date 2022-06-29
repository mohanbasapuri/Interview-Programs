package test.com;
import java.util.Scanner;
class FibonacciSeries {
 
  void  fibonacciSeries(int N){
	  
	  int n1=0,n2=1,n3;
	  System.out.print(n1 + " " + n2);
	  for(int i=2;i<=N;i++) {
		  n3=n1+n2;
		  System.out.print(" "+n3);
		  n1=n2;
		  n2=n3;
	  }
  }
 
 public static void main(String[] args) {
     System.out.println("Hello, World!"); 
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the number:");
     int N=scan.nextInt();
   //  int N=100;
     FibonacciSeries fb=new FibonacciSeries();
     fb.fibonacciSeries(N); 
 }
}
