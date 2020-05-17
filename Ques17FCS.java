/*Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome*/

class Ques17FCS
{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int rev=0;
		int temp=num;
		while(temp!=0){
			int d=temp%10;
			rev=rev*10+d;
			temp=temp/10;
		}
		if (num==rev) {
			System.out.println(num+" is a palindrome");
		}
		else{
			System.out.println(num+" is not a palindrome");
		}
	}
}