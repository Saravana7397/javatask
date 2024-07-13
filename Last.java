public class Last
{
	public static void main(String[] args) 
	{
        int[] input = {1, 2, 3, 4, 7};
        int lastElement = input[input.length - 1];
        for (int i = input.length - 1; i > 0; i--) 
		{
            input[i] = input[i - 1];
        }
        input[0] = lastElement;
        for (int i = 0; i < input.length; i++) 
		{
            System.out.print(input[i] + " ");
        }
    }
}