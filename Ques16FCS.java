/*Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001*/
class Ques16FCS
{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int rev=0;
		while(num!=0){
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		System.out.println(rev);
	}
}