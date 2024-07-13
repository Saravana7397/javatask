import java.util.Scanner;
public class Atm
{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   System.out.print("The username is : ");
   String username = input.nextLine();
   System.out.print("The password is : ");
   int password = input.nextInt();
   int bankbalance = 10000;
   if((username.equals("Saravana")) && (password == 2313))
	{
		System.out.println("widthdral");
		System.out.println("deposit");
		System.out.println("balance");
		System.out.println("exit");
		int choice = input.nextInt();
		switch(choice)
		{
		case 1:
		      System.out.print("Enter the amount : ");
			  int width =input.nextInt();
			   bankbalance =bankbalance - width;
			  System.out.print("The balance amount is : "+bankbalance);
			  break;
	    case 2:
		  	  System.out.print("Enter the deposit amount : ");	  
              int deposit = input.nextInt();
			   bankbalance = deposit+bankbalance;
			  System.out.print("The balance amount is : "+bankbalance);
			  break;
		case 3:
              System.out.print("The balance amount is : "+bankbalance);	
			  break;
	    case 4:
              break;
        default: System.out.print("Invalid option");
		}
	}
	else
		{
			 System.out.print("Incorrect password ");
		}
  }
}