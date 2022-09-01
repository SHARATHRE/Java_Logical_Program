import java.util.*;
class reversingnumb
  {
    public static void main(String args[])
    {
      int n,d,r=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number = ");
      n=sc.nextInt();
       
    while(n>0)
      {
        d=n%10;
        r=r*10+d;
        n=n/10;
      }
      System.out.println(r);
      
      
      
    }
  }