import java.util.Scanner;
public class Factorial
{
	public static void main(String[] arg)
	{
	 Scanner input = new Scanner(System.in);
	 System.out.print("enter the number: ");
	 int num= input.nextInt();
	 int a=num/2;
	 for(int i=0;i<a;i++)
	 {
		 for(int j=0;j<num;j++){
			 
			 System.out.print("*");
			
		 }
		 System.out.println();
		 for(int k=0;k<num;k++){
			 for(i=0;i<a;i++){
			 if(k==0)
			 System.out.print("*");
		     if(k==1)
			 System.out.print("1");
			 if(k==2)
			 System.out.print("1");
		     if(k==3)
			 System.out.print("*");
			 }
				 
		 }
		 System.out.println();
	 
	 }
	 
	}
}