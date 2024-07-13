import java.util.Scanner;
public class Farn
{
	public static void main (String[] args)
	{
	 double f,c;
	 System.out.print("Enter the farenheit value: ");
	 Scanner in= new Scanner(System.in);
	 f = in.nextDouble();
	 c = (5/9.0) * (f-32);
	 System.out.printf("%f deg F is %f deg c",f,c);
	 }
}	 
	 
	 
	
	