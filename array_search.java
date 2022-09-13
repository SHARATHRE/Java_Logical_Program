import java.util.*;
class array_search
  {
    public static void main(String args[])
    {
      int i,n,s;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size of array : ");
      n=sc.nextInt();
   
      System.out.print("Enter the search value :");
      s=sc.nextInt();
      
      System.out.println("Enter the array elements : ");
      int a[]=new int[n];
      
      
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(i=0;i<n;i++)
        {
        if(s==a[i])
        {
          System.out.println("the element is found at array a["+i+"]");
          break;
        }
        }
      if(i==n)
      {
        System.out.println("the element is not found");
      }
    }
  }