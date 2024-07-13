import java.util.Scanner;
public class Pos
{
	public static void main(String[] args)
	{
		int i=0;
		int a=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=input.nextInt();
		if(num>0)
		{
		for(i=1;i<=10;i++)
		{
		a=i*num;	
		System.out.println(i+"*"+num+"="+a);
		}
		}
		else
		{
		System.out.print("it is negative number");
		}
	}
}
		
		