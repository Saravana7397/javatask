import java.util.Scanner;
public class Task2
{
  public static void main(String[] args)
  {
	  Scanner input= new Scanner(System.in);
      System.out.println("                   WELCOME TO SATHIYAM CINEMAS");
      System.out.print("movie name          : ");
	  String name = input.nextLine();
      System.out.print  ("Total no of tickets : ");
	  int num  = input.nextInt();
	  System.out.println("Screen number       : 8");
	  System.out.println("Movie time          : 2.00pm ");
	  int num4;
	  num4=num*100;
      System.out.println("Ticket cost is      : "+num4);
	  System.out.println("Seat numbers are    : A1,A2,A3,A4,A5 ");
	  System.out.println("Address             : Bharathi Nagar,Coimbatore-610043");
	  System.out.println("online Booking      : SAthiyamcinema.com");
	  }
}