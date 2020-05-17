//Write a program to initialize an integer array and find the maximum and minimum value of the array.
class Ques2Array
{
	public static void main(String[] args) {
		int ar[]={10,20,30,40,50};
		int max=ar[0];
		int min=ar[0];
		for (int x=0;x<ar.length;x++) {
			if (ar[x]>max) {
				max=ar[x];
			}
			if (ar[x]<min) {
				min=ar[x];
			}
		}
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
	}
}