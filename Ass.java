import java.util.Scanner;
public class Ass
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
    a=a+b+c;
    b=a-b-c;
    c=a-b-c;
    a=a-b-c;
	System.out.println(" "+a);
    System.out.println(" "+b);
    System.out.println(" "+c);
   
  
  }
}  