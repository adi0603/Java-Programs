//Write a program to check if a given integer number is Positive, Negative, or Zero.
class Ques1AFCS
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		if (num==0) {
			System.out.println("Zero");
		}
		else if (num>0) {
			System.out.println("Positive");
		}
		else{
			System.out.println("Negative");
		}
	}
}