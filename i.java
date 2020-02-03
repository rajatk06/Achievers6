import java.util.*;
public class Main
{
    public static int binarySearch(int a[] , int n , int left , int right)
    {   
        if(left==right) return (a[left]==n ? left :-1) ; 
        int mid = left + (right-left)/2;
        if(a[mid]==n) return mid;
        if(a[mid]<n) return binarySearch(a,n,mid+1,right);
        return binarySearch(a,n,left,mid-1);
    }
	public static void main(String[] args) 
	{
		int a[] = { 5, 10, 15, 20, 25, 30, 35, 40 } ;
        
        System.out.println( binarySearch(a,5,0,a.length-1) );
	}
}