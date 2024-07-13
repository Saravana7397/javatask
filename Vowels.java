import java.util.Scanner;
public class Vowels
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print(" ");
  char temp = input.next().charAt(0);
  if((temp == 'a')||(temp == 'e')||(temp == 'i')||(temp == 'o')||(temp == 'u'))
  {
	  System.out.print(temp+" is vowels");
   }
  else if(temp>'a'&&'z'>temp)
   {
      System.out.print(temp+" consonent");
   }
  else 
   {
      System.out.print(temp+" is numeric");
   }
 }
}