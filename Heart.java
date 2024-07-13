import java.util.Scanner;
public class Heart
{
		public static void main(String[] args)
		{
			String username="saravana";
			int password=1234;
			Scanner input= new Scanner(System.in);
			System.out.print("enter a user name : ");
			String user =input.nextLine();
			System.out.print("enter a password : ");
			int pass =input.nextInt();
			if((username.equals(user))&&(password==pass))
			{
				System.out.print("welcome studio");
			}
			else{
				System.out.print("wrong username or password");
			}
		}
}
			