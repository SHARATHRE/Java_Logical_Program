import java.util.*;
class frequency_array
  {
    public static void main(String args[])
    {
      int i;
      
      
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter the size of array : ");
      n=sc.nextInt();
      int a[]=new int[n];
      boolean v[]=new boolean[n];
      System.out.println("Enter the array elements : ");
      
      
      
      
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          v[i]=false;
        }
     System.out.println("
      for(i=0;i<n;i++)
        {
          
          if(v[i]==true)
          {
            continue;
          }

         
          for(int j=i;j<n;j++)
            {
               c=0;
              if(a[i]==a[j])
              {
                v[j]=true;
                c++;
              }
              System.out.println(a[i]+" "+c);
            }
          
        }
     
          
      }
    }
  