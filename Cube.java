import java.util.Scanner;
public class Cube
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("The Number is : ");
		int num = input.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println(i*i*i);
		}
	}
}
		
		 