import java.util.Scanner;
public class RemoveDuplicate
{
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a word:");
		String s =input.nextLine();
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			//for(int j=1;j<s.length();j++){
				if(ch[i]==ch[i+1]){
					count++;
			System.out.println(ch[i]);
				//}
			}
		}
				
	}
}