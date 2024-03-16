package day100;

public class greatestTwoNum {
	public static void main(String args[]) {
		
		int num1=20 , num2=10 , temp;
		
		if(num1 == num2) 
			System.out.println("Equal number");
			else {
				
				temp = num1 > num2 ? num1 : num2; // turnary operator
				System.out.println( "Greatest number " + temp );
			}
		
	    
	}

}
