public class Sta
{
	public static void main(String[] args)
	{
		String[] bank ={"iob","sbi","ib"};
		int[] num={1,2,3,4,5};
		num[2]=10;
		bank[0]="kvb";
		System.out.println(bank[0]);
		System.out.println(num[2]+""+","+num[3]);
		System.out.println("bank length is : "+bank.length);
		System.out.println("num length is : "+num.length);
	}
}