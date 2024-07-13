import java.util.Scanner;
public class Count
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num=input.nextInt();
		int num1=1;
		int i=0;
		while(num1<=num)
		{
			num=num/10;
			i++;
		}
		System.out.print(i);
	}
}
