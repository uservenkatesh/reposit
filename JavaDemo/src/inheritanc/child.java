package inheritanc;

public class child extends parent {
		
     static parent p=new parent();
	static child ch=new child();
	
		static void static_method() {
			System.out.println("this is child with static");
		}
		 
		void non_static() {
			System.out.println("this is child without static");
		}
		
		public static void main(String[] args) {
			
			static_method();
			parent.static_method();
			p.non_static1();
			ch.non_static();
				
		}
	}

