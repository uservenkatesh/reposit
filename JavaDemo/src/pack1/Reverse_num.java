package pack1;

public class Reverse_num {

	public static void main(String[] args) {

		int number = 12345, rev = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		rev = rev * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + rev);  
		}  
}
