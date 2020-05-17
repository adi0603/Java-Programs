//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
class Ques5Array
{
	public static void main(String[] args) {
		int ar[]={10,60,40,50,30,20};
		for (int x=0;x<ar.length;x++ ) {
			for(int y=0;y<ar.length-1-x;y++){
				if (ar[y]>ar[y+1]) {
					int temp=ar[y];
					ar[y]=ar[y+1];
					ar[y+1]=temp;
				}
			}
		}
		System.out.println("2 Largest = "+ar[ar.length-1]+","+ar[ar.length-2]);
		System.out.println("2 Smallest = "+ar[0]+","+ar[1]);
	}
}