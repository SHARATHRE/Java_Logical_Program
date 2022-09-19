import java.util.*;
class factorial
  {
    int i,f=1;
   
    void fact()
    {
      int n;
       Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
      for(i=1;i<=n;i++)
        {
          f=f*i;
        }
      System.out.println("the factorial of the given number is : "+f);
    }
  }
class fact_oops
  {
    public static void main(String args[])
    { 
      System.out.print("Enter the number :");
      factorial f1=new factorial();
      f1.fact();
    }
  }