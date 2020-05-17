/*Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *

*/
//Using For Loop
class Ques15FCS
{
	public static void main(String[] args) {
		int len=args.length;
		if (len>0) {
			int line=Integer.parseInt(args[0]);
			for (int x=1;x<=line ;x++ ) {
				for (int y=1;y<=x ;y++ ) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("Please enter an integer number");
		}
	}
}

//Using While Loop
class Ques15FCS
{
	public static void main(String[] args) {
		int len=args.length;
		if (len>0) {
			int line=Integer.parseInt(args[0]);
			int x=1;
			while(x<=line){
				int y=1;
				while(y<=x) {
					System.out.print("* ");
					y++;
				}
				System.out.println();
				x++;
			}
		}
		else{
			System.out.println("Please enter an integer number");
		}
	}
}