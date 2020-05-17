//Initialize an integer array with ascii values and print the corresponding character values in a single row.
class Ques4Array
{
	public static void main(String[] args) {
		int ar[]={65,75,85,105,115};
		for (int x=0;x<ar.length;x++) {
			System.out.print((char)ar[x]+"\t");
		}
	}
}