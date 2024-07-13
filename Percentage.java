import java.util.Scanner;
public class Percentage 
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
	System.out.print("total no students : ");
	int Student = input.nextInt();
	System.out.print("total no of boys : ");
	int boys = input.nextInt();
	int a=90;//total no of students
	int b=45;//total no of boys
	int c=a-b;//to calculate how many girls in class
	System.out.println("total no of girls : "+c);
	System.out.print("The boys get A grade : ");
	int boy = input.nextInt();
	int d=20;//20 boys get A grade
	int e=c-d;//to calculate how many girls get A grade 
	System.out.print("The girls get A grade : "+e);
  
  
  }
}  