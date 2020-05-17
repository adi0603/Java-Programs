/*Print an array that contains the exact same numbers as the given array, but rearranged so that all 
the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. 
You may modify and print the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]*/
class Ques10Array
{
	public static void main(String[] args) {
		int ar[]={1, 0, 1, 0, 0, 1, 1};
		Ques10Array.evenOdd(ar);
	}
	public static void evenOdd(int ar[]){
		int array[]=new int[ar.length];
		int index=0;
		for(int x=0;x<ar.length;x++){
			if(ar[x]%2==0){
				array[index]=ar[x];
				index++;
			}
		}
		for(int x=0;x<ar.length;x++){
			if(ar[x]%2!=0){
				array[index]=ar[x];
				index++;
			}
		}
		for (int x=0; x<array.length; x++) {
           System.out.print(array[x]+" ");  
        }
	}
}