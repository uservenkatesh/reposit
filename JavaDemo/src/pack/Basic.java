package pack;

public class Basic {

	public static void main(String[] args) {
		System.out.println("This is main method");
		ChildOne ob=new ChildOne();   
		ob.method1();
System.out.println("String is:"+ob.s1+ "\n" +"Integer is:"+ob.a+ "\n" +"char is:"+ob.ch);
		
	}
}

	 class ChildOne {
		 String s1="venkatesh";
		 int a=5;
		 char ch='v';
		 void method1(){
			 System.out.println("This is child class"); 
	 }
}
	 


