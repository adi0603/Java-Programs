/*Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}*/
class Ques7Array
{
	public static void main(String[] args) {
		int ar[]={12,34,12,45,67,89};
		for (int x=0;x<ar.length ;x++ ) {
			for(int y=x+1;y<ar.length;y++){
				if (ar[y]==ar[x]) {
					ar[y]=0;
                	if (ar[y]==0) {
                    	for (int z=y;z<ar.length-1 ;z++ ) {
                        	int temp=ar[z];
                        	ar[z]=ar[z+1];
                        	ar[z+1]=temp;
                    	}
                	}
				}
			}
		}
		for (int x=0;x<ar.length ;x++ ) {
			if (ar[x]!=0) {
				System.out.print(ar[x]+"\t");
			}			
		}
	}
}