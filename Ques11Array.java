/*Given an array of type int, print true if every element is 1 or 4. 

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true*/
class Ques11Array
{
	public static void main(String[] args) {
		int ar[]={1, 4, 2, 4};
		System.out.println(Ques11Array.only14(ar));
	}
	public static boolean only14(int ar[]){
		boolean flag=true;
		for (int x=0;x<ar.length ;x++ ) {
			if (ar[x]!=1 && ar[x]!=4) {
				flag=false;
				break;
			}
		}
		return flag;
	}
}