package pack;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		
		System.out.println("enter the data: ");
		
		Scanner sc=new Scanner(System.in);
		int math1=sc.nextInt(),science1=sc.nextInt(),eng1=sc.nextInt();
		
		//int math=60,science=50,eng=40;
		
		if(math1>=60 && science1>=50 && eng1>=40) {
			System.out.println("passed");
		}
		
		else
			System.out.println("failed");
	}

}
