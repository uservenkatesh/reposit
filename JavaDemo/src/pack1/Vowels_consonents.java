package pack1;

import java.util.Scanner;

public class Vowels_consonents {

	public static void main(String[] args) {
		
		System.out.println("Enter the charecter: ");
		
		Scanner sc=new Scanner(System.in);
		
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
				
				||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
			
			System.out.println("etered charecter is vowel");
			
		}
		
		else if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
			System.out.println("entered is consonent");
	}
		else
			System.out.println("invalid");
	}
}
