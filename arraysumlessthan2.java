import java.io.*;
import java.util.* ;

class GFG {
    static boolean triplet (double arr[] )
    {
        Arrays.sort(arr) ;
        for(int i=0;i<arr.length-3;i++)
        {
            double sum = arr[i] + arr[i+1] + arr[i+2] ;
            if(sum>(double)1 && sum<(double)2) return true ;
        }
        return false ;
    }
	public static void main (String[] args) {
	    double arr[] = {0.6, 0.7, 0.8, 1.2, 0.4} ;
	    if(triplet(arr)) System.out.print(1) ;
	    else System.out.print(-1); 
	}
}