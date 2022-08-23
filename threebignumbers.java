import java.util.*;
class threebignumbers
  {
    public static void main(String args[])
    {
      double a,b,c;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the A = ");
      a=sc.nextDouble();
       System.out.println("Enter the B = ");
      b=sc.nextDouble();
       System.out.println("Enter the C = ");
      c=sc.nextDouble();
      
    if(a>b)
    {
      if(a>c)
        System.out.println("A is big");
      else
        System.out.println("c is big");
    }
      else
      {
        if(b>c)
          System.out.println("B is big");
        else
          System.out.println("C is big");
      }
  }
}