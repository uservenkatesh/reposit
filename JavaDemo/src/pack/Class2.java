package pack;

public class Class2 {
	
	int a=1;//non static variable
    
	static String st="venkatesh";//static variable
	
	public static void main(String[] args) {//main method
	
		int b=2;//local variable
		Class2 c1=new Class2();//creating object
		System.out.println("local variable: "+b);//printing local variable
		System.out.println("instance variable: "+c1.a);//calling non static variable
		System.out.println("static variable: "+st);//calling static variable
		c1.non_static_method();//calling non static method
		static_method();//calling static method
	
	}
	
	void non_static_method(){//creating non static method
		System.out.println("This is non static method:");//print statement
	
	}
	
	static void static_method() {//creating static method
		System.out.println("This is static method");//print statement
	}

}

