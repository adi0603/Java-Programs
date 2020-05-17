/*Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.
If the character value is in uppercase, the output should be displayed in lowercase in the following format.*/
class Ques7FCS
{
	public static void main(String[] args) {
		char ch='A';
		if (ch>=97 && ch<=122) {
			System.out.println((char)(ch-32));
		}
		else if(ch>=65 && ch<=90)
		{
			System.out.println((char)(ch+32));
		}
	}
}