import java.util.Scanner;
public class StarDec
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num=input.nextInt();
		int k=0;
		int i=0;
		for(i=1;i<=num;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=num-i;j++)
        {
		 System.out.print("* ");
		 
		 }
		System.out.println();
		}
	}
}
	
