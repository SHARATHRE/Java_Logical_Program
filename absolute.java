import java.util.*;
class absolute
  {
    public static void main(String args[])
    {
      int a;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the number = ");
      a=sc.nextInt();
      
    
    if(a>0)
    {
      System.out.println("The absolute number is: "+a);
    }
      else
    {
      System.out.println("The absolute number is: "+(-a));
    }
      
  }
}