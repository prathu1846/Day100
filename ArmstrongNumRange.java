package day100;

import java.util.Scanner;

public class ArmstrongNumRange {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the low and upper range :");
			
			int low = sc.nextInt();
			
			int high = sc.nextInt();
			
			System.out.println(" Armstrong number between :" + low + " and " + high + " are : ");
			
			for(int num = low ; num <= high; num++) 
			{
				int sum = 0, temp ,digit ,len;
				
				len = getOrder(num);
				temp= num;
				
				while(temp !=0)
				{
				digit = temp % 10;
				
				sum = sum + (int) Math.pow(digit, len);
				temp /=10;
				
				};
				
				if (sum == num)
					System.out.print(num + " ");
			}
		}
		
	}
	
	private static int getOrder(int num)
	{
		int len = 0;
		while(num!=0)
		{
			len++;
			num = num/10;
		}
		return len;
	
	}
       
}


