package Automation;

public class AutoTest
{

	public static void main(String[] args) 
	{
		int a=45;
		boolean n=noCheck(a);
		if(n)
		  System.out.println("Given number is a two digit number");
		else
			System.out.println("Given number is Not a two digit number");
	}
	
	public static boolean noCheck(int x)
	{
		if(x>9 && x<100)
			return true;
		else 
			return false;
	}
}
//Added new line from SDET1

