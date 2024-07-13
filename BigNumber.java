import java.util.Scanner;
public class BigNumber
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
   int temp=(a>b)?a:b;
   int d =c>temp?c:temp;
   System.out.println("biggest number is : "+d);
   
  
  }
}  