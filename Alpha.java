import java.util.Scanner;
public class Alpha
{
	public static void main (String[] args)
	{
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter The number : ");
	 int num = input.nextInt();
	 int i=0;
	 int j=0;
	 int k=0;
	 for(i=1;i<=num;i++)
	 {
     for(j=0;j<num-i;j++)
	 {
		 
		 System.out.print(" ");
	 }
	 for(j=1;j<=i;j++)
		{
		  k++;	
		  System.out.print(k+" ");
		}
		System.out.println();
		
	 }
	}
}