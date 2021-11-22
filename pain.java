import java.util.*;
class pain
{
	public static int lower_bound(int arr[],int l,int r,int se)
	{
		while( r-l>1)
		{
			int mid=l+((r-l)/2);
			if(arr[mid]<=se)
				l=mid+1;
			else
				r=mid;
		}
		if(arr[l]>=se)
			return l;
		else 
			return r;
		
	}
	 public static void main(String[] args) {
		try
		{
          Scanner sc=new Scanner(System.in);
          int t=sc.nextInt();
          while(t-->0)
          {
          	int n=sc.nextInt();
          	int arr[]=new int[n];
          	for (int i=0;i<n;i++)  arr[i]=sc.nextInt();
          	long res=0;
          	for(int i=0;i<n-2;i++)
          	{
          		for(int j=i+2;j<n;j++)
          		{

                  int ind=lower_bound(arr,i,j,(arr[i]+arr[j])/2);
                 
                  ind=(int)Math.min(ind,j-1); 
                   //System.out.println(ind);
                  long a=0,b=0;
                  
                  a=(long)(arr[ind]-arr[i])*(arr[j]-arr[ind]);
                 
                  b=(long)(arr[ind-1]-arr[i])*(arr[j]-arr[ind-1]);
                  res+=(long)Math.max(a,b);
                 // System.out.println(res);
          		}
          	}
          	System.out.println(res);
          }
		}
		catch(Exception e)
		{

		}
	}
}
