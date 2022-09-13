

import java.util.Scanner;
class unique
{
  public static void main(String args[]){
    int i;

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size :");
    int n=sc.nextInt();
    int a[]=new int[n];
    boolean v[]=new boolean[n];
    System.out.println("Enter the elements of the array : ");
    for (i=0;i<n;i++)
      {
      a[i]=sc.nextInt();
        v[i]=false;
      }
   
    System.out.println("Element Count");
     for(i=0;i<n;i++)
       {
         if(v[i]==true)
           continue;
       
       
       int c=1;
    for(int j=i+1;j<n;j++)
      {
        if(a[i]==a[j])
        {
          v[j]=true;
        c++;
          
        }
      }
         if(c==1)
         {
            System.out.println("The unique element is: "+a[i] );
         }
       
    
       }
  }
}