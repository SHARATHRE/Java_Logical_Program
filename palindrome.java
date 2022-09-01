import java.util.*;
class palindrome
  {
    public static void main(String args[])
    {

    int d,n,r=0,t;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number = ");
     n=sc.nextInt();
     t=n;   
    while(n>0)
      {
        d=n%10;
        r=r*10+d;
        n=n/10;
      }
      if(r==t)
      {
         System.out.println("The number is a palindrome number");
      }
      else{
         System.out.println("The number is a not a palindrome number");
      }
    }
  }