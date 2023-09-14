package polymorphism;

	class Overriding1 extends Overriding   {
		
	    void meth1(){
		
			System.out.println("This is overriding 1 ");	
		
	    }	
		 
	    public static void main(String[] args) {
			
	    	Overriding o2=new Overriding();
	    	
	    	Overriding1 o1=new Overriding1();
			
			 o1.meth1();
			 
			 //o2.meth1();
			 
	    }
		 
	}

	
	
	
