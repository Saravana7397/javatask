import java.util.Scanner;
public class Percentage1
{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   System.out.print("Total number of students: ");
   int students = input.nextInt();
   System.out.print("Total number of boys: ");
   int boys = input.nextInt();
   System.out.print("Total percentage of A grade : ");
   int per = input.nextInt();
   //to calculate total number of A grade
   int a=90;
   int b=50;
   int c=90*50/100;
   System.out.println("Total number of A grade : "+c);
   System.out.print("The boys get A grade : ");
   int boy = input.nextInt();
   int girl =c-boy;
   System.out.print("The girls get A grade : "+girl);
   
  
  }
}  