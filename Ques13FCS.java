//Write a program to print prime numbers between 10 and 99.
class Ques13FCS
{
	public static void main(String[] args) {
		for (int x=10;x<=99;x++) {
			boolean prime=true;
			for(int y=2;y<=(x/2);y++){
				if(x%y==0){
					prime=false;
					break;
				}
			}
			if (prime) {
				System.out.println(x);
			}
		}
	}
}