import java.util.Scanner;
public class Sr
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	int a[]=new int[5];
	int i=0;
	int sum=0;
	int num=0;
	int r=0;
	for( i=0;i<a.length;i++)
	 {
		 System.out.print("enter the number :");
		 a[i] = input.nextInt();
	 }
	for( i=0;i<a.length;i++)
	{
		
	if(a[i]%2==0)
	{
		System.out.println("even numbers : " +a[i]);
		num=num+a[i];
		
	}
	else{
		System.out.println("odd number : "+a[i]);
		r=r+a[i];
	}
	
	sum=sum+a[i];

	}
		
		System.out.println("total even numbers : "+num);
	    System.out.println("total odd numbers : "+r);
		System.out.println("total numbers : "+sum);
	   
	}
} 