import java.util.Scanner;
public class Calcu
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = input.nextInt();
		int count=0;
		int c=0;
		int d=0;
		int e=0;
		for(int i=0;i==0;i++)
		{
		while((num<=999)&(100<=num))
		{
		  c=num%100;
		  d =c%10;
		  System.out.println(" "+d);
		  count++;
		  break;
		 }
		 while(c>d)
		 {
			 e=c/10;
			 System.out.println(" "+e);
			 count++;
			 break;
		 }
		 while(c>e)
		 {
			 int f =num/100;
			 System.out.println(" "+f);
			 count++;
			 break;
		 }
		 if(count>0)
		 {
			 System.out.print(count+ "digits");
		 }
	    }
		
	}
}