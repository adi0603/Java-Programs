//Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
class Ques1BFCS
{
	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		if ((num1%10)==(num2%10)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}