import java.util.Scanner;
public class Increnment
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
   if((a<b)&(b<c))
   {
	   System.out.println("increment");
   }else if((a>b)&(b>c))
   {
	   System.out.println("decrement");
   }else 
   {
	   System.out.println("neither increasing or decreasing order");
	   
  }
}
}