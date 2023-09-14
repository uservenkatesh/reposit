package pack1;

import java.util.Scanner;

public class Month_name {

	public static void main(String[] args) {
	
		System.out.println("enter the number: ");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
	String arr[]= {"jan","feb","mar","apr","may","june","july","aug","sept","oct","nov","dec"};	
	
	
	for(int a1=0;a1<arr.length;a1++) {
	   if(a1==a) {
		   System.out.println("entered num is: "+arr[a]);
	   }
	}
	    }
	}


