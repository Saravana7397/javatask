import java.util.Scanner;
public class Fibo
{
	public static void main(String[] args)
	{
	  Scanner input=new Scanner(System.in);
	  System.out.print("Enter a Number :");
	  int number=input.nextInt();
	  int a=0;
	  int b=1;
	  int t;
	  
	  System.out.print(b);
	  for(int i=0;i<=number;i++)
	  {
		 t=a+b;
		 System.out.print(t);
		 a=b;
		 b=t;
		 
		  
	  }
	
		
	}
}

	  