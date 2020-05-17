//Write a program to check if a given number is prime or not.
class Ques12FCS
{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		boolean prime=true;
		for(int x=2;x<=(num/2);x++){
			if(num%x==0){
				prime=false;
				break;
			}
		}
		if (prime) {
			System.out.println(args[0]+" is Prime.");
		}
		else{
			System.out.println(args[0]+" is not Prime.");
		}
	}
}