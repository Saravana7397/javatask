import java.util.Scanner;
public class Odd
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("The number is : ");
		int num = input.nextInt();
		for(int i=1;i<=num;i=i+2)
		{
			System.out.println(i);
		}
	}
}
		