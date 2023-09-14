package polymorphism;

public class Overloading {

	static Overloading ov=new Overloading();
	
	void meth1(){
		
		System.out.println("This is without aurgments");
		
	}
	
	void meth1(int a,int b) {
		
		System.out.println("This is with aurgments with int type "+(a+b));
	}
	
    void meth1(char a,int b) {
		
		System.out.println("This is with aurgments with char and int "+a +b);
	}
	
    void meth1(char a,char b) {
		
		System.out.println("This is with aurgments with char type "+a +b);
	}
	
	

	public static void main(String[] args) {
		
	     ov.meth1();
	     
	     ov.meth1(1, 2);
	     
	     ov.meth1('c', 2);
	     
	     ov.meth1('1', '2');
		
	}

}
