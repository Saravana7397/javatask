import java.util.Scanner;
public class Big
{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   System.out.print("The number is : ");
   int a = input.nextInt();
   System.out.print("The number is : ");
   int b = input.nextInt();
   System.out.print("The number is : ");
   int c = input.nextInt();
   int d=(a>b)?a:b;
   int e=(c>d)?c:d;
   System.out.print("biggest number is "+e);
  
  
  }
}  