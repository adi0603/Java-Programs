//Write a program to print even numbers between 23 and 57. Each number should be printed in a separate row.
class Ques11FCS
{
	public static void main(String[] args) {
		for (int x=23;x<=57 ;x++ ) {
			if (x%2==0) {
				System.out.println(x);
			}
		}
	}
}