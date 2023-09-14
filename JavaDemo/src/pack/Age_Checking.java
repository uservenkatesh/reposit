package pack;

import java.util.Scanner;

public class Age_Checking {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("Eligible");
		}
		
		else if(age<17)
			System.out.println("not eligible");
		
	}

}
