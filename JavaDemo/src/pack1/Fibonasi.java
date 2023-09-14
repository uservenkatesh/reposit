package pack1;

public class Fibonasi {
	
	static void Split(){
		
		String s1="Hello World";
		String[] s=s1.split(" ");
		for(int i=0;i<s.length;i++) {
			
		System.out.println(" \nsplitting: " +s[i]);
		StringBuffer sb=new StringBuffer();
		sb.append(s[i]);
		System.out.println("rev of: "+s[i]+" is:"+sb.reverse());
	}
	}
	
	static void duplicate() {
		
		    String str = " abcdef abc";
	        char[] c = str.toCharArray();
	        System.out.print("\nDuplicates:");
	        for (int i = 0; i < str.length(); i++) {
	        for (int j = i + 1; j < str.length(); j++) {
	            if (c[i] == c[j]) {
	               System.out.print(c[j]);
	               break;
	            }
	         }
	    }
	}
	
	static void reverse() 
	{
		String st="ReverseString";
		char[] ch=st.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);
		}
	}
	
	static void febonasi()
        {
		int n1=0,n2=1,n3,i,count=10;    
		 System.out.print("\n"+n1+" "+n2); 
		  for(i=2;i<count;++i)
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }     
	}
	
	public static void main(String[] args) {
		reverse();
		febonasi();
		duplicate();
		Split();
	}
}
