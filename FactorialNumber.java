package day100;

import java.util.Scanner;

public class FactorialNumber {
	
	static int factorial(int n)
	{
		int a = 1  , i;
		for(i = a; i<=n; i++)
			a *= i;
		return a;
//
//		if(n==0)   set base case when num==0 return 1;
//			return 1;
//		return n * factorial(n-1); cases return in getfactor;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num;
		num=sc.nextInt();
		System.out.println("Factorial of : " + num  +  "Factorial number is :" + factorial(num));
		sc.close();

	}

}


