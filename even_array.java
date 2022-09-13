//Write a JAVA program to count total number of even and odd elements in an array


import java.util.*;
class even_array
  {
    public static void main(String args[])
    {
      int i,n;
      int ec=0;
      int oc=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size of array : ");
      n=sc.nextInt();
     System.out.println("Enter the array elements : ");
      int a[]=new int[n];
      
      
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(i=0;i<n;i++)
        {
          if(a[i]%2==0)
          {
            ec++;
          }
          else 
          {
           oc++; 
          }
          
        }
       System.out.println("Total number of even number in the array is : "+ec);
          System.out.println("Total number of odd number in the array is : "+oc);
    }
  }