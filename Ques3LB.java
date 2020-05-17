//Write a Program to accept two integers as command line arguments and print the sum of the two numbers.
class Ques3LB
{
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("The sum of "+args[0]+" and "+args[1]+" is "+(a+b));
	}
}