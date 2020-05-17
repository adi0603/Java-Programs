/*Write a program to check if the program has received command line arguments or not.
If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)*/
class Ques3FCS
{
	public static void main(String[] args) {
		int len=args.length;
		if (len>0) {
			for (int x=0;x<len;x++) {
				if(len-x==1){
					System.out.print(args[x]);
				}
				else{
					System.out.print(args[x]+",");
				}
			}
		}
		else{
			System.out.print("No Values");
		}
	}
}