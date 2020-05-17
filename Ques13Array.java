/*Write a program to reverse the elements of a given 2*2 array. 
Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1*/
 class Ques13Array
 {
 	public static void main(String[] args) {
 		int len=args.length;
 		if (len==4) {
 			int ar[][]=new int[2][2];
 			int index=0;
 			for(int x=0;x<2;x++){
 				for(int y=0;y<2;y++){
 					ar[x][y]=Integer.parseInt(args[index]);
 					index++;
 				}
 			}
 			System.out.println("The given array is :");
 			for(int x=0;x<2;x++){
 				for(int y=0;y<2;y++){
 					System.out.print(ar[x][y]+" ");
 				}
 				System.out.println();
 			}
 			System.out.println("The reverse of the array is :");
 			for(int x=1;x>=0;x--){
 				for(int y=1;y>=0;y--){
 					System.out.print(ar[x][y]+" ");
 				}
 				System.out.println();
 			}
 		}
 		else{
 			System.out.println("Please enter 4 integer numbers");
 		}
 	}
 }