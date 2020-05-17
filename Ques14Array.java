/*Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222*/
 class Ques14Array
 {
 	public static void main(String[] args) {
 		int len=args.length;
 		if (len==9) {
 			int ar[][]=new int[3][3];
 			int index=0;
 			int max=0;
 			for(int x=0;x<3;x++){
 				for(int y=0;y<3;y++){
 					ar[x][y]=Integer.parseInt(args[index]);
 					index++;
 				}
 			}
 			System.out.println("The given array is :");
 			for(int x=0;x<3;x++){
 				for(int y=0;y<3;y++){
 					System.out.print(ar[x][y]+" ");
 					if (ar[x][y]>max) {
 						max=ar[x][y];
 					}
 				}
 				System.out.println();
 			}
 			System.out.println("The biggest number in the given array is "+max);

 		}
 		else{
 			System.out.println("Please enter 9 integer numbers");
 		}
 	}
 }