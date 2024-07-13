import java.util.Scanner;
public class Stars
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter The Number : ");
		int num = s.nextInt();
		int i=0;
		int j=0;
		
		for(i=1;i<=num;i++)
		{
		for(j=1;j<=num-i;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}		 
		 
		
		
	}
}