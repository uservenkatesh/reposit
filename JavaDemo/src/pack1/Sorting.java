package pack1;
import java.util.Arrays;  

public class Sorting {
	static void sorting_numeric() {
		int arr[]= {5,7,3,4,2,9};
	
		Arrays.sort(arr); 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}	
	}
	
	static void sorting_string() {
		
		String st = "venkatesh";
		char ch[]=st.toCharArray();
		
		Arrays.sort(ch);
		
		for(int i=0;i<ch.length;i++) {
		
			System.out.println(ch[i]);	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sorting_numeric();
		sorting_string();
	}
}
