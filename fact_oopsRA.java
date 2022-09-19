import java.util.*;
class factorialRA
  {
    int i,f=1;
   
    int fact(int n)
    {
      for(i=1;i<=n;i++)
        {
          f=f*i;
        }
      return f;
    }
  }
class fact_oopsRA
  {
    public static void main(String args[])
    { 
      int a,z;
      System.out.print("Enter the number :");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      factorialRA f1=new factorialRA();
      z=f1.fact(a);
      System.out.println("the factorial of the given number is : "+z);
    }
  }