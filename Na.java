import java.util.Scanner;
public class Na
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
		for(int j=1;j<=num-i;j++)
		{
			System.out.print(" ");
		}
		int m=i;
		for(int j=1;j<=i-1;j++)
        {
		 
		 System.out.print(m--);
		 
		}
		 
		for(int j=1;j<=i;j++)
		{
		k++;
		System.out.print(k);
		}
		System.out.println();
		k=0;
		
		}
	}
}
	
