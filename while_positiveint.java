import java.util.*;
class while_positiveint
  {
    public static void main(String args[])
    {
      int n,d,s=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the digits = ");
      n=sc.nextInt();
       
    while(n>0)
      {
        d=n%10;
        s=s+d;
        n=n/10;
      }
      System.out.println("The sum of digits of positvie integer = "+s);
      
      
      
    }
  }