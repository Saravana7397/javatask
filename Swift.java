import java.util.Scanner;
public class Swift
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the array size:");
		int size=input.nextInt();
		int[] myarray=new int[size];
		for(int i=0;i<myarray.length;i++)
		{
			myarray[i]=input.nextInt();
		}
		for(int i=0;i<myarray.length;i++)
		{
			//System.out.println(myarray[i]);
		}
		int temp1 = myarray[myarray.length - 2];
        int temp2 = myarray[myarray.length - 1];

       for (int i = myarray.length - 1; i >= 2; i--) {
            myarray[i] = myarray[i - 2];
        }

        myarray[0] = temp1;
        myarray[1] = temp2;

        
       for(int i=0;i<myarray.length;i++) {
            System.out.println(myarray[i]);
        }
	}
}
	