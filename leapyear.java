import java.util.*;
class leapyear
  {
    public static void main(String args[])
    {
      int y;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the year = ");
      y=sc.nextInt();
      
 
    if(y%4==0)
    {
   System.out.println("The year is a leap year");     
    }
    else
    {
   System.out.println("the year is not a leap year");
    }
  }
}