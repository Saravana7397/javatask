import java.util.Scanner;
public class Duplicate
{  
	public static void main(String[] args) 
	{  
        
		Scanner input = new Scanner(System.in);
		int i=0;
        int[]arr = new int [6];
		
        for( i=0;i<arr.length;i++)
	 {
		 System.out.print("enter the number :");
		 arr[i] = input.nextInt();
	 }
	   for(i=0;i<arr.length;i++) 
	   {  
            for(int j=i+1;j<arr.length;j++) 
			{  
                if(arr[i]!=arr[j])
				{  
					System.out.print(arr[i]);
				}
				
				
					
            }  
        }  
	}
}