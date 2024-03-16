package day100;

import java.util.Scanner;

public class sumOfnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num,sum=0;
		System.out.println("Enter the Number :");
		num=sc.nextInt();
		
		
		
		while(num!=0) {
			sum += num % 10 ;
			num = num/10;
			
		}
		
		System.out.println("Sum of digits : " +sum);
		sc.close();
	}

}
