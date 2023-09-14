package pack;

public class Basic_Programs {

	public static void main(String[] args) {

		Reverse();
	}

	static void Reverse(){
		 
		int a = 2538, rev = 0;  
		while(a != 0)   
		{  
		int rem = a % 10;  
		rev = rev * 10 + rem;  
		a = a/10;  
		}  
		System.out.println("The reverse of the given number is: " + rev);  
		}  
	
}  
