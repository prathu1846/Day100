package day100;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number,rem,originalNumber,result=0;
		number=sc.nextInt();
		originalNumber = number;
		
		
		
		while (originalNumber !=0) {
			rem = originalNumber % 10;
			result += Math.pow(rem, 3);
			originalNumber /= 10;
		}
		if(result == number)

			System.out.println(number + " is Armstrong");
		else
			System.out.println(number + " is not Armstrong ");
   sc.close();
	}

}
//
//int num = 407, len;
//
//// function to get order(length)
//  len = order (num);
//
//// check if Armstrong
//if (armstrong (num, len))
//    System.out.println(num + " is armstrong");
//else
//    System.out.println(num + " is armstrong");
//
//}
//
//
//static int order (int x)
//{
//int len = 0;
//while (x != 0 )
//  {
//len++;
//x = x / 10;
//  }
//return len;
//}
//
//static boolean armstrong (int num, int len)
//{
//
//int sum = 0, temp, digit;
//temp = num;
//
//// loop to extract digit, find power & add to sum
//while (temp != 0)
//  {
//// extract digit
//digit = temp % 10;
//
//// add power to sum
//sum = sum + (int)Math.pow(digit, len);
//temp /= 10;
//  };
//
//return num == sum;