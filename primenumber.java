package javabasics;

import java.util.Scanner;

class PrimeNumber
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Check the Number whether prime or no " + "\n" + "Please don't try to test me if you are good at math");
        int inputnumber = sc.nextInt();
        int count = 0;
        if(inputnumber ==1)
        {
        	System.out.println(inputnumber + "Is a not a prime Number");
        }
        else
        {
        	
        if(inputnumber > 1)
        {
       
        for(int i=2; i<=inputnumber; i++)
        {
            if(inputnumber%2==0)
              count++;
        }
       
        if(count >= 2)
        {
            System.out.println(inputnumber + "Is a not a prime Number");
        }
        else
        {
            System.out.println(inputnumber + "Is a prime Number");
        }
        }
        else
        {
        	System.out.println(inputnumber + "Is not a prime Number");
        }
        }
       
       
    }
}
