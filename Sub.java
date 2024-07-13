import java.util.Scanner;
public class Sub
{
	public static void main(String[] args)
	{
	double num1=10+Math.random()*30;
	double num2=15+Math.random()*20;
	int a=(int)num1;
	int b=(int)num2;
	System.out.print("what is "+a + "-"+b+"?");
	int ans=a-b;
	Scanner input=new Scanner(System.in);
	int c=input.nextInt();
	if(ans==c)
	{
		System.out.print("your answer is correct");
	}
	else
	{
		System.out.print("wrong answer");
	}
	}
}
	
	