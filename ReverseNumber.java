package day100;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num,reverse=0,rem;
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		
		while(num != 0) {
			rem=num%10;
			reverse= reverse * 10 + rem;
			num/=10;
		}
		System.out.println("Reverse number is : " +reverse);
        sc.close();
	}

}


// for loop 

// for(;num != 0; num=  num/10)
// {
// rem = num % 10;
//reverse = reverse * 10 + rem;
//};

// recursion method

//nt num = 1234;

//getReverse (num);
//}
//
//static void getReverse (int num)
//{
//if (num == 0)
//return;
//
//int rem = num % 10;
//System.out.print (rem);
//
//getReverse (num / 10);

