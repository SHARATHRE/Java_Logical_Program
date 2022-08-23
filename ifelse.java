import java.util.*;
class ifelse
  {
    public static void main(String args[])
    {
      int A,B;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the value of A = ");
      A=sc.nextInt();
      
 System.out.println("Enter the value of B = ");
      B=sc.nextInt();

    if(A>B)
    {
      System.out.println("A is big");     
    }
    else
    {
      System.out.println("B is big");
    }
  }
}