//Program to find charcter frequency in a given string 


import java.util.Scanner;
class stringfreq
{
  public static void main(String args[])
  {
    String s;
    int i,j,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string ");
     s=sc.nextLine();
    n=s.length();
    boolean visited[]=new boolean[n];
    for (i=0;i<n;i++)
      {
     
        visited[i]=false;
      }
   
    System.out.println("character  count");
     for(i=0;i<n;i++)
       {
         if(visited[i]==true)
           continue;
       
       
       int c=1;
    for(j=i+1;j<n;j++)
      {
        if(s.charAt(i)==s.charAt(j))
        {
          visited[j]=true;
        c++;
        }
      }
         
         
       
       
    System.out.println("  "+s.charAt(i) + "\t\t    "     +c);
         
       
  }
  }
}