import java.util.Scanner;
public class Nu
{
	public static void main(String[] arg)
	{
	 Scanner input = new Scanner(System.in);
	 System.out.print("enter the number: ");
	 int num= input.nextInt();
	 int i=0;
	 int j=0;
	 int k=0;
	 int a=num*(num+1)/2;
	 for(i=1;i<=num;i++){
		 
	 for(j=0;j<i;j++)	{ 
	 if(j!=0)
	System.out.print(" ");
	 }
	 for(k=0;k<=num-i;k++){
		 
		 System.out.print(a--);
	 }
		 System.out.println();
		 
		}
	}
}
	 
	 

	 
	 