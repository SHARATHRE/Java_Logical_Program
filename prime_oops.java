import java.util.*;
class primenumber
  {
    int i,c=0;
   
    void prime(int n)
    {
       for(i=1;i<=n;i++)
       {
         if(n%i==0)
         {
           c++;
         }
            
       }
      if(c==2)
      {
        System.out.println("The number is a prime number");
      }
        else
      {
        System.out.println("The number is not a prime number");
      }
    }
  }
class prime_oops
  {
    public static void main(String args[])
    { 
      int a;
      System.out.print("Enter the number :");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      primenumber p1=new primenumber();
      p1.prime(a);
    }
  }