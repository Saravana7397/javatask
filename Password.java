import java.util.Scanner;
public class Password
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String num = input.nextLine();
		int pass=1234;
		int count=0;
		for(int i=1;i<=3;i++)
		{
			System.out.print("Enter your password : ");
			int pwd = input.nextInt();
			if(pass==pwd)
			{
				System.out.println("welcome");
				break;
			}
			else
			{
				System.out.println("try again");
				count++;
			}
		}
		if(count==3)
		{
				System.out.println("account is locked");
		}
    }
}