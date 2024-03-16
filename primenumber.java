package day100;
import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=6;
		boolean flag = false;
		
		for(int i=2;i<=num;i++) {
			
			if(num%i==0) {
				
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(+num +" prime number");
		}else {
			System.out.println(+num +" not prime number");
		}
		sc.close();
	}

}
