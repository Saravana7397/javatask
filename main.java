import java.util.Scanner;
public class Main
{  
	public static void main(String[] args) 
	{  
        
		Scanner input = new Scanner(System.in);
        int[]arr = {1,2,2,3,3,4,5};
        int counter=0;
	   for(int i=0;i<arr.length;i++) 
	   {  
            for(int j=i+1;j<arr.length;j++) 
			{  
                if(arr[i]==arr[j])
				{  
					counter=counter+1;
					arr[j]=0;
				}
            }  
        }
        int r[]=new int[arr.length-counter];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                r[k]=arr[i];
                k++;
            }
        }
        for(int c:r){
        System.out.print(c+" ");
        }
	}
}