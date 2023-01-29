import java.util.Scanner;
class Patterns2
{
    public static void main (String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter no of * to be printed");
     int inputfromuser = sc.nextInt();
     for(int i=1; i<=inputfromuser;i++)
     {
      for(int j=1;j<=i;j++)
      {
          System.out.print("*");
      }   
      System.out.println("\n");
     }
    }
}
