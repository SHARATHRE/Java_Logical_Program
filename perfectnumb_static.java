import java.util.*;
class perfectnumber
  {
    static int perfect(int n)
    {
      int i=1,c=0;
      while(i<n)
       {
         if(n%i==0)
         {
           c=c+i;
         }
         i++;
          
       }
     
     return c;
    }
  }
class perfectnumb_static
  {
    public static void main(String args[])
    { 
      int a;
      System.out.print("Enter the number :");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      int b=perfectnumber.perfect(a);
       if(b==a)
      {
        System.out.println("The number is a perfect number");
      }
        else
      {
        System.out.println("The number is not a perfect number");
      }
    }
  }