package adding2numbers;//Package in Java is a mechanism to encapsulate a group of classes

import java.util.Scanner;//import Scanner class which is in util folder inside the java folder 
   //util :stands for utility and contains utility classes.
   //Scanner : is a predefined class for taking inputs from user.

public class Adding {
	static int add(int x, int y)//here we are declaring the the variables by taking static.
	//int data type is the primary integer data type 
		    {
		        int carry;//to initialize the variables
		        while(y!=0)// if y not equal to zero it will execute the loop 
		        	           //till the condition get false
		        	//while loop statement in java programming language repeatedly 
		        	//executes a target statement as 
		        	//long as given condition is true
		        {
		            carry = x & y;  // using operators to add
		            x = x ^ y;
		            y = carry << 1;
		        }
		        return x;
		    }
		    public static void main(String args[])
		    {
		       Scanner input = new Scanner(System.in);// to scan the values which we initialize
		        System.out.println("Enter the values of x and y:");
		        int x = input.nextInt(); //scans next token of the input as int
		        int y = input.nextInt();
		        System.out.println("The Summation is: "+add(x, y));
		        
		    }
		}
