
import java.util.*;

public class EvenOdd
{
	public static void evenoddcheck()   
	{ 
		int num1=0,x=1;
       Scanner myObj=new Scanner(System.in);

       while(x==1)
       {
       try{
    			System.out.println("Enter number:-");
    			num1=myObj.nextInt();
    			if(num1%2==0)
    					System.out.println("Even Number");
    			else
    					System.out.println("Odd Number");
    			x=0;
   		   }catch(Exception e)
     			 {
    					System.out.println("\t\t\tInvalid Input. You Cannot Enter Decimal,Character or String.");
    					myObj.nextLine();
      			 }
	    }
    }

//	public static void main(String[] args)
//	{
//		evenoddcheck();
//  }

}