package pack;

public class Basic_for_loop {

	public static void main(String[] args) {
		//for loop
		System.out.println("for loop:");
		for(int i=0;i<=9;i++)
		{
			System.out.print(i+" ");
			
		}
        System.out.println("\nwhile loop:");
		
        //While loop
        char a='0';
		
		while(a<='d') {
			
			System.out.print(a+" ");
			a++;
		}
		System.out.println("\n Do While loop: ");
		
		//do while loop
		int b=9;
		do {
			
			System.out.print(b+" ");
			b--;
			
		}while(b>=1);   
     }
}
