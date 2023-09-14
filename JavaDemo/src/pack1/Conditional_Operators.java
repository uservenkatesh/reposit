package pack1;

import java.util.Scanner;

public class Conditional_Operators {

	public static void main(String[] args) {
		
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		
		if(a>b) {
			System.out.println(a+ " greater than " +b);
		}
		else if(a<b) {
			System.out.println(b+ "greater than "+a);
		}
		else
			System.out.println("both are equal");
		
	}

}
