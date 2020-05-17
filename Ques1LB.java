/* Write a Program that accepts two Strings as command line arguments and generate the output in the required format. 

Example1)
If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

Example2)
If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai.*/
class Ques1LB
{
	public static void main(String[] args) 
	{
		System.out.println(args[0]+" Technologies "+args[1]);
	}
}