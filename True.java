import java.util.Scanner;
public class True
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int []a={1,2,3,4,5};
		boolean b=false;
		System.out.print("Enter the target :");
		int target = input.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					
					b=true;
					break;
				}
			}
			if(b==true){
				break;
			}
		}
		System.out.println(b);
	}
}