package javabasics;
import java.util.Scanner;
import java.util.*;

public class primenumbersfromselectednumbers 
{
    public static void main( String[] args)
    {
    	System.out.println("PLease input the range to print");
    	Scanner sc = new Scanner(System.in);
    	System.out.println("PLease Input the first Number");
    	int firstnumber = sc.nextInt();
    	System.out.println("PLease Input the second Number");
    	int secondNumber = sc.nextInt();
    	ArrayList<Integer> listofprimenumbers = new ArrayList<>();
    	int noOfPrimeNumbers = 0;
    	int copyoffirstnumber = firstnumber;
    	if((firstnumber<0 && secondNumber<0) || (secondNumber <= firstnumber))
    	{
    		System.out.println("Make Sure You Select the correct combinations " + "\n" + "1.Any of two numbers should not be negative"+"\n"+ "2.Second number should be greater than first");
    		
    	}
    	else
    	{
    		while(copyoffirstnumber <= secondNumber)
    		{
    			int count =0;
    			if(copyoffirstnumber >1)
    			{
    			
    				for(int i=2;i<=copyoffirstnumber;i++)
    				{
    					if(copyoffirstnumber%i==0)
    					{
    						count++;
    					}
    				}
    				if(count<2)
    				{
    					noOfPrimeNumbers++;
    					listofprimenumbers.add(copyoffirstnumber);
    					
    				}
    			}
    			copyoffirstnumber++;
    		}
    		System.out.println("No of Prime NUmbers between" + firstnumber + "and" + secondNumber + " is " + noOfPrimeNumbers);
    		System.out.println(listofprimenumbers);
    	}
    	
    }
}
