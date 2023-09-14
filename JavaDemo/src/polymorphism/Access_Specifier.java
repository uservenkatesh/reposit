package polymorphism;

	public class Access_Specifier {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    Access_Specifier Aref= new Access_Specifier();
	    Aref.publicMethod();
	    Aref.privateMethod();
	    Aref.protectedMethod();
	    Aref.defaultPackage();
	     
		}
	public void publicMethod() { 
		System.out.println("Print the Public Method");
	}
	private void privateMethod() {
		System.out.println("Print the Private Method");
	}
	protected void protectedMethod() {
		System.out.println("Print the protected Method");
	}
	void defaultPackage() {
		System.out.println("Print the default Method");
	}

	}
