package pack;

public class even_prime {

	public static void main(String[] args) {
		
		prime_num();
		//even();
	}
		static void even() {
		
		for(int i=0;i<=20;i++) {
			
			System.out.print(" "+i*2);	
		}
		
		}

	static void prime_num(){
		
			  int num = 50, count;

			  for (int i = 1; i <= num; i++) {
			   count = 0;
			   for (int j = 2; j <= i / 2; j++) {
			    if (i % j == 0) {
			     count++;
			     break;
			    }
			   }
			   if (count == 0) {
			    System.out.println(i);
			   }
			  }
	}
}
	
