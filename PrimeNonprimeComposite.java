
import java.util.*;

public class PrimeNonprimeComposite
{

	public static void pncCheck()
	{
       int num1,x=1,flag=2;     // Flag=2 because if we assign it '0' or '1' then it will print Default Answer.
       Scanner myObj=new Scanner(System.in);  // Creating Scanner Object
       while(x==1)  // Infinite loop, untill their is a proper output
       {
       		try{   // Try Catch Block for Exception Handling
      			 System.out.println("Enter a Positive Integer:-");
      			 num1=myObj.nextInt();  // Taking User Input by using Scanner Object
      			 if(num1<0)  // If the input is negative it will say Error Message.
      					 {
       						System.out.println("You Cannot Enter Any Negative Integer.");
      					 }
      			 else{
       					if(num1==0 || num1==1)
       							System.out.println(num1+" is neither a Prime nor a Composite Number.");
       					else
      						 {
      	 						for(int i=2;i<=num1/2;i++)
      								{
       									if(num1%i==0)     										 	
       											flag=1;      											
       									else      											
       											flag=0;	
      							    }
      						 }
                        if(flag==0)   // Flag Check
       							System.out.println(num1+" is a Prime Number.");  

       					if(flag==1)  // Flag Check
      	 						System.out.println(num1+" is a Non-Prime Number.");
      					 x=0;  // While loop ends here.
  					 }
      		   }catch(Exception e)   // For Catching the Exception found in TRY Block.
       				{
       					System.out.println("\t\t\tInvalid Input. You Cannot Enter Any Decimal,Character or String Value.");
       					 myObj.nextLine();   // For Solving Problem of Infinite Loop and Taking User Input Again. 
      			    }
		}
	}


	public static void main(String[] args)
	{
		pncCheck();
	}
}