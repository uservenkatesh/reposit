package pack1;

public class For_each_example {

	public static void main(String[] args) {
		
		int arr[]= {12,13,14,44};
		
		String st[]= {"suresh","selenium","project","training"};
		
		System.out.print("integers:");
		
		for(int i:arr) {
			System.out.print(" "+i);
			
		}
		
		System.out.print("\nstring:");
		
		for(String s:st) {
			System.out.print(" "+s);
		}
		
	}

}
