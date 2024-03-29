/* 
   CALCULATOR PROJECT IN JAVA
   Created by 'Bhuvan Agarwal' on 04/07/2019
*/
   
   import java.util.*;

   public class Calculator
   {
   	static Scanner myObj=new Scanner(System.in);
   	
   	public static void main(String[] args) throws Exception
     	{   
   		    call();  // Calling the method call(), to start the program execution.
     	}

  /* TRY-CATCH Block in Switch Case */
   	public static void call()
   	{
   		int choice; 
   		System.out.println("\t\t\t\t*****WELCOME TO THE JAVA CALCULATOR*****");
   		while(true)
   		{
   			try
               {
   					System.out.println("\n\t\t\t\t\t\tMenu:-");
   					System.out.println("\t\t\t\t\t1) Addition of two numbers.\n\t\t\t\t\t2) Subtraction of two numbers.\n\t\t\t\t\t3) Multiplication of two numbers.\n\t\t\t\t\t4) Division.\n\t\t\t\t\t5) Remainder.\n\t\t\t\t\t6) Even or, Odd Check.\n\t\t\t\t\t7) Prime,Non-prime or, Composite Check.\n\t\t\t\t\t8) Login to Trigonometry Function.\n\t\t\t\t\t9) Find all Even Numbers within a specified range.\n\t\t\t\t\t10) Find all Odd Numbers within a specified range.\n\t\t\t\t\t11) Sum of Digits of a Number.\n\t\t\t\t\t12) Factorial of a Number.\n\t\t\t\t\t13) Fibonacci Series.\n\t\t\t\t\t14) EXIT Calculator.");
   					System.out.println("Enter your choice:-");
   					choice=myObj.nextInt();  
   			    switch(choice)
   			     {
   					case 1: add();
   							break;
   					case 2: sub();
   							break;
   					case 3: mul();
   							break;
   					case 4: div();
   							break;
   					case 5: rem();
   							break;
   					case 6: EvenOdd.evenoddcheck();   // Method Called from another Class 'EvenOdd' (A seperate Program)
   							break;
   					case 7: PrimeNonprimeComposite.pncCheck();   // Method Called from another Class 'PrimeNonprimeComposite' 
   							break;
   					case 8: trigonometry();
   							break;
   					case 9: evenrange();
   							break;
   					case 10: oddrange();
   							break;
   					case 11: sumdigit();
   							break;
   					case 12: factorial();
   							break;
   					case 13: fibonacci();
   							break;
   					case 14: System.out.println("\t\t\t\t*****Thank You For Using Java Calculator*****");
                    		System.exit(0);   //It Terminates the JAVA Program & "return" Terminates the function only.
                    			default:
                    				System.out.println("\tInvalid Input.\nPlease Enter Value in b/w 1 to 14.");
                    				
                 }
                }catch(Exception e){
                	System.out.println("\t\t\t*****Invalid User Input.*****\n\t\t\tPlease Enter Value in b/w 1 to 14.");  // If their is any Exception found in try block, JVM will 'catch' that and execute the statements from catch block.
                	myObj.nextLine();   // To going back to top.
                }    
        }          
    }



    /* TRY-CATCH Block in Addition Method  */
        public static void add()
        {
        	double num1=0,num2=0;
        	int x=1;
            while(x==1)   //loop that will run untill both the inputs are Numbers.
              {
                try    // 1st TRY Block to check for exceptions in 1st input
        		 {	
        		 	System.out.println("Enter 1st number:-");
        			num1=myObj.nextDouble();
        		 }catch(Exception e)
            			{
            				System.out.println("\t\t\tInvalid Input.You Cannot Enter Any Character or String in Addition Operation.");
            				myObj.nextLine();
            				continue;
            			}
        		 try    // 2nd TRY Block to check for exceptions in 2nd input
        		 {
        			System.out.println("Enter 2nd number:-");
        			num2=myObj.nextDouble();
        			System.out.println("The Answer is: "+ (num1+num2));
        			x=0;	// x=0 , because after Successfull Execution of the Addition Operation, it will come out of loop.
        		 }catch(Exception e)
            			{
            				System.out.println("\t\t\tInvalid Input.You Cannot Enter Any Character or String in Addition Operation.\n\t*****RE-ENTER NUMBERS*****");
            				myObj.nextLine();

            			}
       		  }
        }




    /*  TRY-CATCH Block in Subtraction Method */
        public static void sub()
        {
        	double num1=0,num2=0;
            int x=1;
            while(x==1)
            {
            	try
            	 {
        			System.out.println("Enter 1st number:-");
        			num1=myObj.nextDouble();
        		 }catch(Exception e)
            			{
            				System.out.println("\t\t\tInvalid Input.You Cannot Enter Any Character or String in Subtraction Operation.");
            				myObj.nextLine();
                            continue;
            			}
            	try
            	 {
        			System.out.println("Enter 2nd number:-");
        			num2=myObj.nextDouble();
        			System.out.println("The Answer is: "+ (num1-num2));
        		    x=0;
        		 }catch(Exception e)
            			{
            				System.out.println("\t\t\tInvalid Input.You Cannot Enter Any Character or String in Subtraction Operation.\n\t*****RE-ENTER NUMBERS*****");
            				myObj.nextLine();    
            			}	
        	}
            
        }    



 /* TRY-CATCH Block in Multiplication Operation  */
        public static void mul()
        {
        	double num1=0,num2=0;
        	int x=1;
        	while(x==1)
        	{
        		try
        		{
        	      	System.out.println("Enter 1st number:-");
        			num1=myObj.nextDouble();
        		}catch(Exception e)
        		 {
                    System.out.println("\t\t\tInvalid Input. You Cannot Enter any Character or String in Multiplication Operation.");
                    myObj.nextLine();
                    continue;    // To re-enter 1st number if their is an error.
        		 }
        		 try
        		 {
        			System.out.println("Enter 2nd number:-");
        			num2=myObj.nextDouble();
        			System.out.println("The Answer is: "+ (num1*num2));
        			x=0;
        		 }catch(Exception e)
        		 {
                    System.out.println("\t\t\tInvalid Input. You Cannot Enter any Character or String in Multiplication Operation.\n\t*****RE-ENTER NUMBERS*****");
                    myObj.nextLine();
        		 }
        	}	 
        }
 


 /* TRY-CATCH Block in Division Operation   */
        public static void div()
        {
        	double num1=0,num2=1;
            int x=1;
            while(x==1)
            {
            	try
            	{
        			System.out.println("Enter 1st number:-");
        			num1=myObj.nextDouble();
        		}catch(Exception e)
        		{
        			System.out.println("\t\t\tInvalid User Input. You Cannot Enter any Character or String in Division Operation.");
        			myObj.nextLine();
        			continue;
        		}

        		try
        		{
        			System.out.println("Enter 2nd number:-");
        			num2=myObj.nextDouble();
        			if(num2==0.0)
        			  {
        				System.out.println("Invalid Input. You Cannot Enter '0' as Denominator.\n\t*****RE-ENTER NUMBERS*****");
        				continue;
        			  }
        			System.out.println("The Answer is: "+ (double)num1/num2);
        			x=0;
        		}catch(Exception e)
        		  {
        			  System.out.println("\t\t\tInvalid User Input. You Cannot Enter any Character or String in Division Operation.\n\t*****RE-ENTER NUMBERS*****");
                      myObj.nextLine();
        		  }
        	}
        }




  /* TRY-CATCH Block in Remainder Operation   */
        public static void rem()
        {
        	int num1=0,num2=1,x=1;
            System.out.println("*****NOTE:- You can only enter Integer Values here to find a Proper Remainder.*****");  // Notifying the user that he/she cannot enter decimal number as input coz, (%) operator doesnt work with float numbers
         while(x==1)
         {
          try
          {
        		System.out.println("Enter 1st number:-");
        		num1=myObj.nextInt();
          }catch(Exception e)
            {
            	System.out.println("\t\t\tInvalid Input. You Cannot Enter any Decimal,Character or String Value.");
            	myObj.nextLine();
            	continue;
            }
          try
          {
      		  System.out.println("Enter 2nd number:-");
      		  num2=myObj.nextInt();
       		  System.out.println("The Answer is: "+ (num1%num2));
       		  x=0;
       	  }catch(Exception e)
            {
            	if(num2==0)  // For Checking whether Denominator's value is '0'
            	{
            		System.out.println("\t\t\tInvalid Input. You Cannot Enter '0' as Denominator.\n*****RE-ENTER NUMBERS*****"); 
            		num2=1;  // Setting the Denominator to '1'. So that next time it can again check for error.
            	}
            	else
            	   System.out.println("\t\t\tInvalid Input. You Cannot Enter any Decimal,Character or String Value.\n*****RE-ENTER NUMBERS*****");
            	myObj.nextLine();
            }
        }
    }





    

    

    public static void trigonometry()
    {
    	char ch;

    	System.out.println("\t\t\t\t\t*****WELCOME TO TRIGONOMETRY*****");
    	while(true)
    	{
    		System.out.println("\n\t\ta)sin(x).\t\tb)cos(x).\t\tc)tan(x).\t\td)cot(x).\n\t\te)cosec(x).\t\tf)sec(x).\t\tg)sin^-1(x).\t\th)cos^-1(x).\n\t\ti)tan^-1(x).\t\tj)cot^-1(x).\t\tk)cosec^-1(x).\t\tl)sec^-1(x).\n\t\tm)Logout Trigonometry.");
    		System.out.println("Enter Your Choice:- ");
        ch=myObj.next().charAt(0);  //To Read a Character
        switch(ch)
        {
        	case 'a': sin();
        	break;
        	case 'b': cos();
        	break;
        	case 'c': tan();
        	break;
        	case 'd': cot();
        	break;
        	case 'e': cosec();
        	break;
        	case 'f': sec();
        	break;
        	case 'g': sin_inv();
        	break;
        	case 'h': cos_inv();
        	break;
        	case 'i': tan_inv();
        	break;
        	case 'j': cot_inv();
        	break;
        	case 'k': cosec_inv();
        	break;
        	case 'l': sec_inv();
        	break;
        	case 'm': System.out.println("\n\t\t\t\t*****TRIGONOMETRY Logged Out Successfully*****");
        	System.out.println("----------------------------------------------------------------------------------------------------------------------");
        	           return;    //It will terminate this function and return to previous function.

        	           default:
        	           System.out.println("Invalid Choice");
        	       }
        	   }
        	}



        	public static void sin()
        	{
        		double x;

        		System.out.println("Enter the Value of (x) in degrees:- ");
     	x=myObj.nextDouble();     // Taking user input using Scanner object
       double radian=Math.toRadians(x);   // converting degrees to radians
       System.out.println("sin("+x+")="+Math.sin(radian));   // printing the value of sin(x) to the console.
       
   }

   public static void cos()
   {
   	double x;

   	System.out.println("Enter the Value of (x) in degrees:- ");
   	x=myObj.nextDouble();
   	double radian=Math.toRadians(x);
   	System.out.println("cos("+x+")="+Math.cos(radian));
   }

   public static void tan()
   {
   	double x;

   	System.out.println("Enter the Value of (x) in degrees:- ");
   	x=myObj.nextDouble();
   	double radian=Math.toRadians(x);
   	System.out.println("tan("+x+")="+Math.tan(radian));
   }

   public static void cot()
   {
   	double x;

   	System.out.println("Enter the Value of (x) in degrees:- ");
   	x=myObj.nextDouble();
   	double radian=Math.toRadians(x);
   	System.out.println("cot("+x+")="+(double)1/Math.tan(radian));
   }

   public static void cosec()
   {
   	double x;

   	System.out.println("Enter the Value of (x) in degrees:- ");
   	x=myObj.nextDouble();
   	double radian=Math.toRadians(x);
   	System.out.println("cosec("+x+")="+(double)1/Math.sin(radian));
   }

   public static void sec()
   {
   	double x;

   	System.out.println("Enter the Value of (x) in degrees:- ");
   	x=myObj.nextDouble();
   	double radian=Math.toRadians(x);
   	System.out.println("sec("+x+")="+(double)1/Math.cos(radian));
   }

   public static void sin_inv()
   {
   	double x;

   	System.out.println("Enter the Value of (x) in degrees:- ");
   	x=myObj.nextDouble();
   	double radian=Math.toRadians(x);
   	System.out.println("sin^-1("+x+")="+Math.asin(radian));
   }

   public static void cos_inv()
   {
   	double x;

   	System.out.println("Enter the Value of (x) in degrees:- ");
   	x=myObj.nextDouble();
   	double radian=Math.toRadians(x);
   	System.out.println("cos^-1("+x+")="+Math.acos(radian));
   }

   public static void tan_inv()
   {
   	double x;

   	System.out.println("Enter the Value of (x) in degrees:- ");
   	x=myObj.nextDouble();
   	double radian=Math.toRadians(x);
   	System.out.println("tan^-1("+x+")="+Math.atan(radian));
   }

   public static void cot_inv()
   {
   	double x;

   	System.out.println("Enter the Value of (x) in degrees:- ");
   	x=myObj.nextDouble();
   	double radian=Math.toRadians(x);
   	System.out.println("cot^-1("+x+")="+Math.atan(1/radian));
   }

   public static void cosec_inv()
   {
   	double x;

   	System.out.println("Enter the Value of (x) in degrees:- ");
   	x=myObj.nextDouble();
   	double radian=Math.toRadians(x);
   	System.out.println("cosec^-1("+x+")="+Math.asin(1/radian));
   }

   public static void sec_inv()
   {
   	double x;

   	System.out.println("Enter the Value of (x) in degrees:- ");
   	x=myObj.nextDouble();
   	double radian=Math.toRadians(x);
   	System.out.println("sec^-1("+x+")="+Math.acos(1/radian));
   }

   public static void evenrange()
   {
   	int low,high,i;

   	System.out.println("Enter the lower range value:- ");
   	low=myObj.nextInt();
   	System.out.println("Enter the higher range value:- ");
   	high=myObj.nextInt();

   	for(i=low;i<=high;i++)
   	{
   		if(i%2==0)
   		{
   			System.out.print(i+" ");
   		}
   	}
   }

   public static void oddrange()
   {
   	int low,high,i;

   	System.out.println("Enter the lower range value:- ");
   	low=myObj.nextInt();
   	System.out.println("Enter the higher range value:- ");
   	high=myObj.nextInt();

   	for(i=low;i<=high;i++)
   	{
   		if(i%2!=0)
   		{
   			System.out.print(i+" ");
   		}
   	}
   }

   public static void sumdigit()
   {
   	int num,temp,sum=0;
   	
   	System.out.println("Enter the Number:- ");
   	num=myObj.nextInt();
   	if(num>0 && num<=9)
   	{
   		System.out.println("The Sum of Digits is: "+num);
   		return;
   	}
   	else
   	{
   		while(num>0)
   		{
   			temp=num%10;
   			sum=sum+temp;
   			num=num/10;
   		}
   		System.out.println("The Sum of Digits is: "+sum); 
   	}
   } 

   public static void factorial()
   {
   	int num,temp=1,k;
   	
   	System.out.println("Enter the number:-");
   	num=myObj.nextInt();
   	if(num==0 || num==1)
   	{
   		System.out.println("The Factorial of "+num+" is:- "+1);
   		return;
   	}
   	k=num;
   	while(k>1)
   	{  
   		temp=temp*k;
   		k--;
   	}
   	System.out.println("The Factorial of "+num+" is:- "+temp);
   }
   
   public static void fibonacci()
   {
   	int num,a=0,b=1,pos=3,sum=0;
   	System.out.println("Enter the number of terms you would like to find:- ");
   	num=myObj.nextInt();
   	System.out.print(a);
   	System.out.print(" "+b);
   	while(pos<=num)
   	{
   		sum=a+b;
   		System.out.print(" "+sum);
   		a=b;
   		b=sum;
   		pos++;
   	}

   }

}