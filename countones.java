import java.util.*;
class countones
{
    public static int first_occ(int arr[],int n)
    {
      int low=0,high=n-1;
      while(low<=high)
      {
          int mid=(low+high)/2;
          if(arr[mid]==1)
          {
              if(mid==0||arr[mid-1]==0)
              return mid;
              else
              high--;
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
          
              int n=7;
              int arr[]={0,0,0,1,1,1,1};
              
              System.out.println("count occurrence of ones : "+
              (n-first_occ(arr,n)));
            
      }
      catch(Exception e)
      {
      }
    }
}
