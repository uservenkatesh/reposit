package arrays_2D;

public class min_max_2d {
	
	static int arr[][]= {{90,70,101},{7,88,5}};
	
	static void arr_values(){
	
		System.out.println("length: "+arr.length);//rows
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
			
				System.out.println(arr[i][j]);
			
			}
		}	
	}
	
	static void max_num(){
	  int max=arr[0][0];
	  
	  for(int i=0;i<arr.length;i++) {
		  for(int j=0;j<arr[i].length;j++){
			  if(arr[i][j]>max) {
				  max=arr[i][j];
			  }
		  }
	  }
	  System.out.println("max: "+max);
	}
	
	
	static void min_num(){
	
		
		int min=arr[0][0];
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
			
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
			
			}
		}
		System.out.println("min: "+min);
	}
	
	public static void main(String[] args) {
		
		arr_values();
		
		min_num();
		
		max_num();
	}

}
