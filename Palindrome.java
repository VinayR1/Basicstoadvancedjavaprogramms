import java.util.Scanner;
class Palindrome
{
    public static void main (String[] args) 
    {
     //Scanner sc = new Scanner(System.in);
     //System.out.println("Enter the Number to check palindrome or not");
     //int inputnumber = sc.nextInt();
     //int copyofnumber = inputnumber;
     int inputnumber = 11;
     int copyofnumber = inputnumber;
     int checkingpalindrome =0;
     while(copyofnumber > 0)
     {
        int reducednumber = copyofnumber%10;
        checkingpalindrome = (checkingpalindrome*10) + reducednumber;
        copyofnumber = copyofnumber/10;
     }
     
     if((inputnumber == checkingpalindrome) && inputnumber > 0)
       System.out.println(" Yes it is a palindrome");  
     else
         if(inputnumber <= 0)
         System.out.println("Dont try to test me please enter the number greater than 0");
         else
         System.out.println("OOps it's not a palindrome");
         
         
    }
}
