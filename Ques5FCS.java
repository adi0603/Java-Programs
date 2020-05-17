/*Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.*/
class Ques5FCS
{
	public static void main(String[] args) {
		char ch='A';
		if(ch>=65 && ch<=90 || ch>=97&& ch<=122){
			System.out.print("Alphabhet");
		}
		else if(ch>=48 && ch<=57){
			System.out.print("Digit");
		}
		else{
			System.out.print("Special Character");
		}
	}
}