package day100;
import java.util.Scanner;


public class leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year;
		year=sc.nextInt();
      
      
      if(year%400==0 || year%4==0 && year%100  !=0) 
    	  
    	  System.out.println( "leap year");
    	  
       else 
    	   
    	  System.out.println( "Not leap year" );
      sc.close();
      
	}

}

// using ternary operator

// int flag = (year%400 == 0 || (year%4==0 && year%100 !0) ? 1 : 0;
// if(flag==1)
//print
//else
//print
