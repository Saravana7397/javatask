import java.util.Scanner;
public class TabMul
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("enter a number:"); 
		int num=input.nextInt();
		int n=1;
	    for (int i=1;i<=num;i++)
		{
			
			
		System.out.print(n*i+" ");
		if(i==num)
		{
			i=0;
			n++;
			System.out.println();
		}
		if(n==(num+1))
		{
			break;
		}
		}
		
	}
}