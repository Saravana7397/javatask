import java.util.Scanner;
public class Large
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		float f = input.nextFloat();
		if((f>100000)&(f!=0))
		{
			System.out.println("largest positive number ");
		}
		else if((f<100000)&(f!=0))
		{
			System.out.println("smallest positive number ");
		}
		else if(f==0)
		{
			System.out.println("number is Zero");
		}
		
	}
}