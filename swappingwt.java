import java.util.*;
class swappingwt
  {
    public static void main(String args[])
    {
      int a,b;
      
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of a= ");
      a=sc.nextInt();
 System.out.println("Enter the value of b= ");
      b=sc.nextInt(); 
     System.out.println("Number's before swapping");
      System.out.println("a= "+a);
     System.out.println("b= "+b);
     a=a+b;
     b=a-b;
     a=a-b;

 System.out.println("Number's after swapping"); 
 System.out.println(" a= "+a);
 System.out.println(" b= "+b);
      
    }
  }