import java.util.Scanner;
public class Negative
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	System.out.print("enter the number: ");
	int num=input.nextInt();
	if(num==1)
	{
		System.out.println(num);
	}
	for(int i=2;i<=num;i++)
	{
		System.out.print("*");
	}
	
		
	}
}