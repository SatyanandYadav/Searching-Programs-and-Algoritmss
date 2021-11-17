/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//this searching algorithms is only working for sorted array and non-repeating element
//time complexity is O(log n) and space complexity is O(log n)
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void binary_search(int arr[],int n,int se,int low,int high)
    {
      if(low >high)
      {
          System.out.println("Searching element is not present");
         return; 
      }
      int mid =(low+high)/2;
      if(arr[mid]==se)
      {
          System.out.println("Searching element is present at index : "+mid);
          return;
      }
      else if(arr[mid]>se)
      {
          
          binary_search(arr,n,se,low,mid-1);
      }
      else
       {
           binary_search(arr,n,se,mid+1,high);
       }
      
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        
	    
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		    
		}
		int se=sc.nextInt();
		binary_search(arr,n,se,0,n-1);
	    } catch(Exception e) {
	    } finally {
	    }
	}
}
