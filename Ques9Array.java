/*Print a version of the given array where all the 10's have been removed. 
The remaining elements should shift left towards the start of the array as needed, 
and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. 
You may modify and display the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]*/
class Ques9Array
{
    public static void main(String[] args) {
        int ar[]={10, 2, 10};
        Ques9Array.withoutTen(ar);
    }
    public static void withoutTen(int ar[]){
        for (int x=0;x<ar.length ;x++ ) {
            if (ar[x]==10) {
                ar[x]=0;
                if (ar[x]==0) {
                    for (int y=x;y<ar.length-1 ;y++ ) {
                        int temp=ar[y];
                        ar[y]=ar[y+1];
                        ar[y+1]=temp;
                    }
                    x=x-1;
                }
            }

        }
        for (int x=0; x<ar.length; x++) {
            System.out.print(ar[x]+" ");  
        }
    }
}