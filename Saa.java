import java.util.Scanner;
public class Saa
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = input.nextInt();
		int i=0;
		int k=0;
		
		for(i=1;i<=num;i++)
			
		{
		for(int j=1;j<=i;j++)
		{
		k++;
		System.out.print(k+" ");
		}
		 System.out.println();
		 k=0;
		}
		
	}
}
			