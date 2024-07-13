import java.util.Scanner; 
public class Sorting
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int []a= new int[5];
		String []b=new String[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("enter the number : ");
			a[i] = input.nextInt();
			
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print("enter the name : ");
			b[i] = input.next();
		}
	}
}