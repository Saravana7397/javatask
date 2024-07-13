public class Merge
{
	public static void main(String[] args)
	{
		int[] array1 = {1, 2, 3};
		int[] array2 = {4, 5, 6};
		int[] combinedArray = new int[array1.length + array2.length];

		int index=0;
		for(int i=0;i< array1.length;i++) 
		{
		combinedArray[index++]=array1[i];
		}
		for(int i=0;i<array2.length;i++) 
		{
		combinedArray[index++]=array2[i];
		}
		for(int i=0;i<combinedArray.length;i++)
		{
			System.out.print(combinedArray[i]);
		}
	}
}
		