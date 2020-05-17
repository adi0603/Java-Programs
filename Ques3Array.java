/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.*/
class Ques3Array
{
	public static void main(String[] args) {
		int ar[]={1,4,34,56,7};
		int search=4;
		int index=-1;
		boolean found=false;
		for (int x=0;x<ar.length;x++) {
			if (search==ar[x]) {
				found=true;
				index=x;
			}
		}
		if (found) {
			System.out.println(index);
		}
		else{
			System.out.println(-1);
		}
	}
}