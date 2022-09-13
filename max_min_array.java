import java.util.*;
class max_min_array
  {
    public static void main(String args[])
    {
      int i,n,ma,mn;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size of array : ");
      n=sc.nextInt();
     System.out.println("Enter the array elements : ");
      int a[]=new int[n];
      
      
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
          ma=a[0];
          mn=a[0];
        
      for(i=0;i<n;i++)
        {
          System.out.println("the value of array a["+i+"] is " +a[i]); 
          if(ma<a[i])
        {
          ma=a[i];
        }
        if(mn>a[i])
        {
          mn=a[i];
        }
        }
      System.out.println("the maximum in the array is :"+ma);
      System.out.println("the minimum in the array is :"+mn);
    }
  }