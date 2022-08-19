import java.util.*;
class arear
  {
    public static void main(String args[])
    {
      double  l;
      double  b;
      Scanner sc=new Scanner(System.in);

      System.out.println("enter the length l: ");
      l=sc.nextDouble();
       System.out.println("enter the width b: ");
      b=sc.nextDouble();
      
      System.out.println("The rectangle of length "+l+ " and width " +b+ " has area of = " +(l*b));
      System.out.println("The rectangle of length "+l+ " and width " +b+ " has circumference of = " +(2*(l+b)));
      
        
    }
  }