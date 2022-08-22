import java.util.*;
  class simpleinterest
  {
    public static void main(String args[])
    {
      double p,r,m,si,ta;
      
      
      Scanner sc=new Scanner(System.in); 
      
      System.out.println("Enter the principle amount = ");
      p=sc.nextDouble();
      System.out.println("Enter the rate of interest = ");
      r=sc.nextDouble();
      System.out.println("Enter the number of t=months = ");
      m=sc.nextDouble();
      si=(p*r*m)/100;
      ta=p+si;
      System.out.println("The simple interest is: "+si);
       System.out.println("The total amount is: "+ta);
    }
  }