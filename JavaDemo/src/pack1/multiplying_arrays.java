package pack1;

public class multiplying_arrays {

	public static void main(String[] args) {
		
		multipli();
		//array_multi();
	
	}
	
	static void multipli() {
		
		System.out.println("multiplication table: ");
	
	     int a=9;
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(a+"*"+i+"="+a*i);
			
		}
		
	}

	static void array_multi(){
      int a=1,arr[]= {1,2,3,4};
		
		for(int i=0;i<arr.length;i++) {
			
			a=a*arr[i];	
		}
		System.out.println(a);
	}
	
}
