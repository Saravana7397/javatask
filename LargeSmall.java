import java.util.Scanner;
public class LargeSmall
{	
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	int a[]=new int[5];
	int large=0;
	int small=0;
	for(int i=0;i<a.length;i++)
	{
		System.out.print("Enter the number : ");
		a[i]=input.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				large=a[j];
				break;
			}
		}
		if(large>a[i])
		{
			small=a[i];
		}
	}
	 System.out.println(large);
	 System.out.println(small);
	 int c=large-small;
	 System.out.println(c);
	}
}