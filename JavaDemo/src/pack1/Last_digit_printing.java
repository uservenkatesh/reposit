package pack1;

import java.util.Scanner;

public class Last_digit_printing {

	static void sum_of_array() {
		
	int a = 0,ar[]= {1,2,3,4,5,6,7,8,9};
	
      for(int i=0;i<=ar.length-1;i++) {//i=1 2 3
    	
    	  a=a+ar[i];                   //a=1 3 6
      }
     
      System.out.println(a);
		
	}	
	static void last_digit(int a) {
		
		//System.out.println("enter the number: ");
		//Scanner sc=new Scanner(System.in);
		
		// a=sc.nextInt();
	
	     System.out.println("last num is: "+a%10);	
	}

	
	public static void main(String[] args) {
		
		//sum_of_array();
		//last_digit(567);
		
		
		int arr[]= {10,20,30,40,50};
		
		
		int a=0;
		
		for(int i: arr) {//i=0 1
			
			a=a+i;              //a=10 30
		
		}
		
		System.out.println(a);	
		
}
}
