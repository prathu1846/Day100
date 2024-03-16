package day100;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Fibonacci number :");
		int num=sc.nextInt();
		int a,b;
		System.out.println("Enter the a number :");
		a=sc.nextInt();
		System.out.println("Enter the b number :");
		b=sc.nextInt();
		System.out.println(a+ "  " + b + "  ");
		
		int nextTerm;
		
		for(int i=2;i<num;i++)
		{
			nextTerm = a + b;
			a=b;
			b=nextTerm;
			System.out.println( "Fibonacci Series is :  " + nextTerm );
			sc.close();
		}
	}

}



