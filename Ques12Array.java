/*Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]*/
class Ques12Array
{
	public static void main(String[] args) {
		int ar1[]={1,2,3};
		int ar2[]={4,5,6};
		Ques12Array.middleWay(ar1,ar2);
	}
	public static void middleWay(int ar1[],int ar2[]){
		System.out.println("["+ar1[1]+", "+ar2[1]+"]");
	}
}