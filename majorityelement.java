
class Solution
{
    static int majorityElement(int arr[], int size)
    {
        int count=0,ele=0;
        for(int i=0;i<size;i++)
        {
          if(count==0)
          ele=arr[i];
          if(ele==arr[i])
          count++;
          else
          count--;
        }
        if(count>0)
        {
            int c=0;
            for(int i=0;i<size;i++)
            {
             if(ele==arr[i])
             c++;
             
            }
            if(c>size/2)
            return (ele);
            else
            return -1;
        }
        else
        return -1;
    }
}
