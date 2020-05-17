// Write a program to check if a given integer number is odd or even.
class Ques2FCS
{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if (num%2==0) {
			System.out.println("even");			
		}
		else
		{
			System.out.println("odd");
		}
	}
}