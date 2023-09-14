package pack;
public class BasicDemo2 {
	
	static int a=7;//static variable
	int b=6;//instance variable or non static variable
	
	public static void main(String[] args) {//main method
		int c=5;//local variable
		
		method_static();//static method
		System.out.println("static variable: "+a);//calling static variable and printing
		
		BasicDemo2 obj=new BasicDemo2();//creating object for parent class
		BasicDemo2.inner obj1=obj.new inner();//creating object for inner class
		obj.method_nonstatic();//calling non static method
		
		System.out.println("non static variable: "+obj.b);//calling non static variable and printing
		System.out.println("local variable: "+c);//calling local variable and printing
		
		obj1.inner_method_non_static();
		obj1.inner_method_static();
		System.out.println("inner class static variable: "+obj1.ch_a);
		System.out.println("");
	}
		
	static void method_static() {	//creating static method
		System.out.println("This is static method");//printing the statement
		}
		
		void method_nonstatic() {	//creating non static method
			System.out.println("This is non static method");//priting the statement
		}
		
		class inner{
			static int ch_a=10;
			int ch_b=11;
			static void inner_method_static() {
				System.out.println("This is child class static method");
			}
			
			void inner_method_non_static() {
				System.out.println("This is child class non static method");
			}
		}		
}
