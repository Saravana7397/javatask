import java.util.Scanner;
public class Month
{
  public static void main (String[] args)
  {
  Scanner input = new Scanner(System.in);
  System.out.print("enter the month : ");
  String a = input.nextLine();
  System.out.print("enter the year : ");
  int b= input.nextInt();
  switch(a){
  case "Jan":
   System.out.println("jan is 31 days");
   break;
   case "feb":
   {
	  if(b%4==0)
	  {
   System.out.println("Feb is 29  days");
	  }
	  else
	  {
		  System.out.println("Feb is 28  days");
	  }
   }
   break;
   case "mar":
   System.out.println("Mar is 30 days");
   break;
   case "apr":
   System.out.println("Apr is 31 days");
   break;
   case "may":
   System.out.println("May is 30 days");
   break;
   case "jun":
   System.out.println("jun is 31 days");
   break;
   case "july":
   System.out.println("July is 30 days");
   break;
   case "aug":
   System.out.println("Aug is 31 days");
   break;
   case "sep":
   System.out.println("Sep is 30 days");
   break;
   case "oct":
   System.out.println("Oct is 31 days");
   break;
   case "nov":
   System.out.println("Nov is 30 days");
   break;
   case "dec":
   System.out.println("Dec is 31 days");
   break;
  }
  
  }
}