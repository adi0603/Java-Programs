/* Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e */
class Ques4FCS
{
	public static void main(String[] args) {
		char ch1='s';
		char ch2='e';
		if (ch1<=ch2) {
			System.out.print(ch1+","+ch2);
		}
		else{
			System.out.print(ch2+","+ch1);
		}
	}
}