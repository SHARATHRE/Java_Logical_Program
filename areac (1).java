import java.util.*;
class areac
  {
    public static void main(String args[])
    {
      double  r;
        float pi=3.14F;
      Scanner sc=new Scanner(System.in);

      System.out.println("enter the radius r: ");
      r=sc.nextDouble();
      
      System.out.println("The circle of radius "+r+" has area of =" +(pi*r*r));
      
        
    }
  }