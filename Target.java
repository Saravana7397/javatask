import java.util.Scanner;
public class Target
{
	public static void main(String[] args )
	{
		Scanner input= new Scanner(System.in);
		int a[]=new int[5];
		System.out.print("Enter the target: ");
		int targets=input.nextInt();
		int num=0;
	for(int i=0;i<a.length;i++)
	{
		System.out.print(" ");
		a[i] = input.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
	for(int j=i+1;j<a.length;j++)
	{
		
	if(a[i]+a[j]==targets)
	{
		System.out.println(i+" "+j);
		break;
	}
	}
	}
	}
}