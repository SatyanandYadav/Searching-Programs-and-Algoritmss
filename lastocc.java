import java.util.*;
class lastoccurrence
{
    public static int last_occ(int arr[],int n,int se)
    {
      int low=0,high=n-1;
      while(low<=high)
      {
          int mid=(low+high)/2;
          if(arr[mid]==se)
          {
              if(mid==n-1||arr[mid+1]!=se)
              return mid;
              else
              low++;
            }
            else if(arr[mid]>se)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
      try
      {
          
              int n=15;
              int arr[]={1,1,1,2,2,2,2,2,3,3,4,4,5,6,7};
              int se=4;
              System.out.println("last occurrence index : "+last_occ(arr,n,se));
            
      }
      catch(Exception e)
      {
      }
    }
}
