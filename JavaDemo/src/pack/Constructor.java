package pack;

public class Constructor {

	public static void main(String[] args) {
		
		const1 c1=new const1();
		const1 c2=new const1(5,4);
		c1.const2();
	}

}

class const1{
	
	const1(){
		
		System.out.println("This is inside the constructor");
		
	}
	
	void const2(){
		
		System.out.println("This is not the constructor");
		
	}
	const1(int a,int b){
		
		System.out.println("This is constructor with arguments: "+(a+b));
		
	}

}
