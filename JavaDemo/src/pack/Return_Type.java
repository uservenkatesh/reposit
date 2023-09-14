package pack;

public class Return_Type {

	int c;
	public static void main(String[] args) {
		
		Return_Type rn=new Return_Type();
		
		rn.method1(2,5);
		System.out.println(rn.c);
		rn.method2();
	}

	 int method1(int a,int b) {
		
		 c=a+b;
		
		return c;
		
	}
		void method2() {
			
			System.out.println("This is with out aurgments");
			
		}
		
	}
	

