package pack1;

import java.util.Scanner;

public class Checking_num_con {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char a=sc.next().charAt(0);
		
		if(a>='a' & a<'z') {
			
			System.out.println("lower case charecters");
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
				System.out.println("lower vowels");
			}
		}
		
		else if(a>='A' & a<'Z')
			System.out.println("upper case charectors");
	}

}
