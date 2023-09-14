package pack1;

public class String_Demo {

	public static void main(String[] args) {
		
		String s1="hello World";
		String s2="This is the ,String with splitting";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(4));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equalsIgnoreCase("HellO WorLd")+ "\nsub string:"+s1.substring(2,7));
		System.out.println(s1.length());
		System.out.println(s1.equals("hello world"));
		System.out.println(s1.startsWith("he"));
		System.out.println(s1.endsWith("ld"));
		
		String[] s=s2.split(",");
		for(int i=0;i<2;i++) {
			System.out.println("splitting:" +s[i]);
			
		}
		
	}

}
