/*Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10*/
class Ques8Array
{
	public static void main(String[] args) {
		int ar[]={10,3,6,1,2,7,9};
		boolean flag=true;
		int sum=0;
		for (int x=0;x<ar.length ;x++ ) {
			if (ar[x]==6) {
				for (int y=x+1;y<ar.length ;y++ ) {
					if (ar[y]==7) {
						flag=false;
						x=y+1;
						break;
					}
				}
			}
			sum=sum+ar[x];
		}
		System.out.println(sum);
	}
}