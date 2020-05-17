//Write a program to initialize an array and print them in a sorted order.
class Ques6Array
{
	public static void main(String[] args) {
		int ar[]={10,60,40,50,30,20};
		System.out.print("Unsorted Array :");
		for (int x=0;x<ar.length ;x++ ) {
			System.out.print(ar[x]+"\t");
		}
		for (int x=0;x<ar.length;x++ ) {
			for(int y=0;y<ar.length-1-x;y++){
				if (ar[y]>ar[y+1]) {
					int temp=ar[y];
					ar[y]=ar[y+1];
					ar[y+1]=temp;
				}
			}
		}
		System.out.print("\nSorted Array :");
		for (int x=0;x<ar.length ;x++ ) {
			System.out.print(ar[x]+"\t");
		}
	}
}