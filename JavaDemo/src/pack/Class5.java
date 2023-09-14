package pack;

class Class5{
	
	public static void main(String[] args) {
		
		int b=2;//local variable
		
		Class3 cl=new Class3();//creating object
		
		System.out.println("local variable: "+b);//printing local variable
		
		System.out.println("instance variable: "+cl.a);//calling instance variable
		
		System.out.println("static variable: "+Class3.st);//calling static variable
		
		cl.non_static_method();//calling non static method
		
		Class3.static_method();//calling static method

	}
	
}

