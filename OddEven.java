import java.util.Scanner;
public class OddEven
{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   System.out.print("enter the number : ");
   int a = input.nextInt();
   String c=((a&1)==0)?"Even":"Odd";
   System.out.println("The number is "+c);
   }
}  