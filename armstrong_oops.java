import java.util.*;
class armstrongnumber
  {
    int s=0,d;
   
    int armstrong(int n)
    {
      while(n>0)
      {
        d=n%10;
        s=s+d*d*d;
        n=n/10;
      }
      return s;
     }
  }
class armstrong_oops
  {
    public static void main(String args[])
    { 
      int a,z;
      System.out.print("Enter the number :");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      armstrongnumber p1=new armstrongnumber();
      z=p1.armstrong(a);
      if(z==a)
      {
        System.out.println("The digit is a armstrong number");
      }
        else
      {
        System.out.println("The digit is not armstrong number");
      }
      
    }
  }