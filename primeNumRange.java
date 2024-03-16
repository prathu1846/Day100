package day100;
import java.util.Scanner;

public class primeNumRange {

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      
      
      int low,up,flag=0;
      System.out.println("Enter lower num :");
      low=sc.nextInt();
      System.out.println("Enter upper num :");
      up=sc.nextInt();
      System.out.println("prime Number : ");
      
      for(int i=low;i<=up;i++) 
      {
    	  for(int j=2;j<i;j++)
    	  {
    		  if(i%j==0) {
    			  flag=0;
    			  break;
    		  }
    		  else
    		  {
    			  flag=1;
    		  }
    	  }
    	  if(flag == 1)
    	  {
    		  System.out.println(i);
    	  }
      }
      sc.close();
    	  
	}

}
